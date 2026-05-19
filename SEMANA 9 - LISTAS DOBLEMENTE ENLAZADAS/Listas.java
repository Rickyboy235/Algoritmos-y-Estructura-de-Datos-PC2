class NodoDoble {
    int dato;
    NodoDoble siguiente, anterior;

    public NodoDoble(int dato) {
        this.dato = dato;
    }
}

class ListaDoble {
    NodoDoble inicio, fin;

    public void insertarInicio(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);

        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            inicio = nuevo;
        }
    }

    public void insertarFinal(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);

        if (fin == null) {
            inicio = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
    }

    public void insertarPosicion(int dato, int pos) {
        if (pos < 0) return;

        if (pos == 0) {
            insertarInicio(dato);
            return;
        }

        NodoDoble aux = inicio;

        for (int i = 0; aux != null && i < pos - 1; i++)
            aux = aux.siguiente;

        if (aux == null || aux == fin) {
            insertarFinal(dato);
            return;
        }

        NodoDoble nuevo = new NodoDoble(dato);

        nuevo.siguiente = aux.siguiente;
        nuevo.anterior = aux;

        aux.siguiente.anterior = nuevo;
        aux.siguiente = nuevo;
    }

    public void eliminarInicio() {
        if (inicio == null) return;

        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
    }

    public void eliminarFinal() {
        if (fin == null) return;

        if (inicio == fin) {
            inicio = fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }
    }

    public void eliminarPosicion(int pos) {
        if (pos < 0) return;

        if (pos == 0) {
            eliminarInicio();
            return;
        }

        NodoDoble aux = inicio;

        for (int i = 0; aux != null && i < pos; i++)
            aux = aux.siguiente;

        if (aux == null) return;

        if (aux == fin) {
            eliminarFinal();
            return;
        }

        aux.anterior.siguiente = aux.siguiente;
        aux.siguiente.anterior = aux.anterior;
    }

    public void recorrerAdelante() {
        NodoDoble aux = inicio;

        while (aux != null) {
            System.out.print(aux.dato + " <-> ");
            aux = aux.siguiente;
        }

        System.out.println("null");
    }

    public void recorrerAtras() {
        NodoDoble aux = fin;

        while (aux != null) {
            System.out.print(aux.dato + " <-> ");
            aux = aux.anterior;
        }

        System.out.println("null");
    }
}

class NodoCircular {
    int dato;
    NodoCircular siguiente;

    public NodoCircular(int dato) {
        this.dato = dato;
    }
}

class ListaCircular {
    NodoCircular ultimo;

    public void insertarInicio(int dato) {
        NodoCircular nuevo = new NodoCircular(dato);

        if (ultimo == null) {
            ultimo = nuevo;
            ultimo.siguiente = ultimo;
        } else {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
    }

    public void insertarFinal(int dato) {
        insertarInicio(dato);
        ultimo = ultimo.siguiente;
    }

    public void insertarPosicion(int dato, int pos) {
        if (pos < 0) return;

        if (pos == 0 || ultimo == null) {
            insertarInicio(dato);
            return;
        }

        NodoCircular aux = ultimo.siguiente;
        int i = 0;

        while (aux != ultimo && i < pos - 1) {
            aux = aux.siguiente;
            i++;
        }

        if (aux == ultimo) {
            insertarFinal(dato);
            return;
        }

        NodoCircular nuevo = new NodoCircular(dato);

        nuevo.siguiente = aux.siguiente;
        aux.siguiente = nuevo;
    }

    public void eliminarInicio() {
        if (ultimo == null) return;

        if (ultimo == ultimo.siguiente)
            ultimo = null;
        else
            ultimo.siguiente = ultimo.siguiente.siguiente;
    }

    public void eliminarFinal() {
        if (ultimo == null) return;

        if (ultimo == ultimo.siguiente) {
            ultimo = null;
            return;
        }

        NodoCircular aux = ultimo.siguiente;

        while (aux.siguiente != ultimo)
            aux = aux.siguiente;

        aux.siguiente = ultimo.siguiente;
        ultimo = aux;
    }

    public void eliminarPosicion(int pos) {
        if (pos < 0 || ultimo == null) return;

        if (pos == 0) {
            eliminarInicio();
            return;
        }

        NodoCircular aux = ultimo.siguiente;
        int i = 0;

        while (aux.siguiente != ultimo.siguiente && i < pos - 1) {
            aux = aux.siguiente;
            i++;
        }

        if (aux.siguiente == ultimo) {
            eliminarFinal();
            return;
        }

        if (aux.siguiente != ultimo.siguiente)
            aux.siguiente = aux.siguiente.siguiente;
    }

    public void recorrer() {
        if (ultimo == null) {
            System.out.println("Lista vacia");
            return;
        }

        NodoCircular aux = ultimo.siguiente;

        do {
            System.out.print(aux.dato + " -> ");
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);

        System.out.println("(inicio)");
    }
}