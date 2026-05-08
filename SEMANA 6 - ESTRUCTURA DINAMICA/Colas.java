// Colas.java
public class Colas {

    /* COLA CON ARREGLO CIRCULAR */

    int[] arreglo = new int[10];
    int frenteArr = 0;
    int finalArr = 0;
    int tamanio = 0;

    public void enqueueArreglo(int dato) {
        if (tamanio == 10) {
            System.out.println("Cola llena");
            return;
        }
        arreglo[finalArr] = dato;
        finalArr = (finalArr + 1) % 10;
        tamanio++;
    }

    public void dequeueArreglo() {
        if (tamanio == 0) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.println("Eliminado: " + arreglo[frenteArr]);
        frenteArr = (frenteArr + 1) % 10;
        tamanio--;
    }

    public void mostrarArreglo() {
        if (tamanio == 0) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("Cola arreglo: ");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(arreglo[(frenteArr + i) % 10] + " ");
        }
        System.out.println();
    }


    /* COLA CON LISTA ENLAZADA */

    int[] colaEnl = new int[100];
    int frenteEnl = 0;
    int finalEnl = 0;

    public void enqueueEnlazada(int dato) {
        colaEnl[finalEnl] = dato;
        finalEnl++;
    }

    public void dequeueEnlazada() {
        if (frenteEnl == finalEnl) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.println("Eliminado: " + colaEnl[frenteEnl]);
        frenteEnl++;
    }

    public void mostrarEnlazada() {
        if (frenteEnl == finalEnl) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("Cola enlazada: ");
        for (int i = frenteEnl; i < finalEnl; i++) {
            System.out.print(colaEnl[i] + " ");
        }
        System.out.println();
    }


    /* COLA CON PRIORIDAD */

    int[] datosPri  = new int[100];
    int[] prioridades = new int[100];
    int tamPri = 0;

    public void enqueuePrioridad(int dato, int prioridad) {
        datosPri[tamPri] = dato;
        prioridades[tamPri] = prioridad;
        tamPri++;
    }

    public void dequeuePrioridad() {
        if (tamPri == 0) {
            System.out.println("Cola vacía");
            return;
        }

        int indiceMayor = 0;
        for (int i = 1; i < tamPri; i++) {
            if (prioridades[i] > prioridades[indiceMayor]) {
                indiceMayor = i;
            }
        }

        System.out.println("Eliminado: " + datosPri[indiceMayor] + " (prioridad: " + prioridades[indiceMayor] + ")");

        for (int i = indiceMayor; i < tamPri - 1; i++) {
            datosPri[i] = datosPri[i + 1];
            prioridades[i] = prioridades[i + 1];
        }
        tamPri--;
    }

    public void mostrarPrioridad() {
        if (tamPri == 0) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("Cola prioridad (dato/prioridad): ");
        for (int i = 0; i < tamPri; i++) {
            System.out.print("[" + datosPri[i] + "/" + prioridades[i] + "] ");
        }
        System.out.println();
    }
}