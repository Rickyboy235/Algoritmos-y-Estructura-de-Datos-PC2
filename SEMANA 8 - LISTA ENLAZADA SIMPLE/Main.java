
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar nodo");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Invertir lista");
            System.out.println("4. Detectar ciclo");
            System.out.println("5. Crear ciclo de prueba");
            System.out.println("6. Fusionar con otra lista ordenada");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingresa número: ");
                    int num = sc.nextInt();
                    lista.agregar(num);
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 3:
                    lista.invertir();
                    System.out.println("Lista Invertida.");
                    break;
                case 4:
                    if (lista.detectarCiclo()) {
                        System.out.println("Se detectó ciclo.");
                    } else {
                        System.out.println("No hay ciclo.");
                    }
                    break;
                case 5:
                    lista.crearCiclo();
                    System.out.println("Ciclo creado para prueba.");
                    break;
                case 6:
                    ListaEnlazada lista2 = new ListaEnlazada();

                    System.out.println("Cantidad de elementos segunda lista: ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Número ordenado: ");
                        lista2.agregar(sc.nextInt());
                    }

                    ListaEnlazada fusionada =
                            ListaEnlazada.fusionar(lista, lista2);

                    System.out.println("Lista Fusionada.");
                    fusionada.mostrar();
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