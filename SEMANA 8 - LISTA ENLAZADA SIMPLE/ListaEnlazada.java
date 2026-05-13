class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class ListaEnlazada {
    Nodo cabeza;

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("NULL");
    }

    public void invertir() {
        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente;

        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }

        cabeza = anterior;
    }

    public boolean detectarCiclo() {
        Nodo lento = cabeza;
        Nodo rapido = cabeza;

        while (rapido != null && rapido.siguiente != null) {
            lento = lento.siguiente;
            rapido = rapido.siguiente.siguiente;

            if (lento == rapido) {
                return true;
            }
        }

        return false;
    }

    public void crearCiclo() {
        if (cabeza == null) return;

        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = cabeza;
    }

    public static ListaEnlazada fusionar(ListaEnlazada l1, ListaEnlazada l2) {
        ListaEnlazada resultado = new ListaEnlazada();

        Nodo a = l1.cabeza;
        Nodo b = l2.cabeza;

        while (a != null && b != null) {
            if (a.dato == b.dato) {
                resultado.agregar(a.dato);
                a = a.siguiente;
            } else {
                resultado.agregar(b.dato);
                b = b.siguiente;
            }
        }

        while (a != null) {
            resultado.agregar(a.dato);
            a = a.siguiente;
        }

        while (b != null) {
            resultado.agregar(b.dato);
            b = b.siguiente;
        }

        return resultado;
    }
}
