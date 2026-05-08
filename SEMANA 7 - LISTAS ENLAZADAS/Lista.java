public class Lista {
    Nodo cabeza;
    
    public Lista() {
        cabeza = null;
    }
    
    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }
    
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    
    public void insertarEnPosicion(int dato, int posicion) {
        if (posicion <= 0) {
            insertarInicio(dato);
            return;
        }
        
        Nodo nuevo = new Nodo(dato);
        Nodo actual = cabeza;
        int indice = 0;
        
        while (actual != null && indice < posicion - 1) {
            actual = actual.siguiente;
            indice++;
        }
        
        if (actual == null) {
            System.out.println("Posicion fuera de rango, se insertará al final");
            insertarFinal(dato);
        }else {
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }
    
    public void eliminarInicio() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
        } else {
            System.out.println("Lista vacía");  
        }
    }
    
    public void eliminar(int dato) {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        
        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }
        
        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            actual = actual.siguiente;
        } 
        
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
    
    public void eliminarEnPosicion(int posicion) {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        
        if (posicion <= 0) {
            eliminarInicio();
            return;
        }
        
        Nodo actual = cabeza;
        int indice = 0;
        
        while (actual.siguiente != null && indice < posicion - 1) {
            actual = actual.siguiente;
            indice++;
        }
        
        if (actual.siguiente == null) {
            System.out.println("Posición fuera de rango");
        } else {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }
    
    public void mostrar() {
        Nodo actual = cabeza;
        
        if (actual == null) {
            System.out.println("Lista vacía");
            return;
        }
        
        while (actual != null) {
            System.out.println(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
