// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Colas colas = new Colas();

        int opcion, dato, prioridad;

        do {
            System.out.println("\n===== MENU COLAS =====");
            System.out.println("--- Cola con Arreglo Circular ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Mostrar");
            System.out.println("--- Cola con Lista Enlazada ---");
            System.out.println("4. Enqueue");
            System.out.println("5. Dequeue");
            System.out.println("6. Mostrar");
            System.out.println("--- Cola con Prioridad ---");
            System.out.println("7. Enqueue");
            System.out.println("8. Dequeue");
            System.out.println("9. Mostrar");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese dato: ");
                    dato = sc.nextInt();
                    colas.enqueueArreglo(dato);
                    break;
                case 2:
                    colas.dequeueArreglo();
                    break;
                case 3:
                    colas.mostrarArreglo();
                    break;
                case 4:
                    System.out.print("Ingrese dato: ");
                    dato = sc.nextInt();
                    colas.enqueueEnlazada(dato);
                    break;
                case 5:
                    colas.dequeueEnlazada();
                    break;
                case 6:
                    colas.mostrarEnlazada();
                    break;
                case 7:
                    System.out.print("Ingrese dato: ");
                    dato = sc.nextInt();
                    System.out.print("Ingrese prioridad: ");
                    prioridad = sc.nextInt();
                    colas.enqueuePrioridad(dato, prioridad);
                    break;
                case 8:
                    colas.dequeuePrioridad();
                    break;
                case 9:
                    colas.mostrarPrioridad();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion inválida");
            }
        } while (opcion != 0);

        sc.close();
    }
}