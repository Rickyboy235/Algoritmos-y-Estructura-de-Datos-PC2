
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaDoble ld = new ListaDoble();
        ListaCircular lc = new ListaCircular();

        int opPrincipal, opSub, dato, pos;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Lista Doble");
            System.out.println("2. Lista Circular");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opPrincipal = sc.nextInt();

            switch (opPrincipal) {
                case 1:
                    do {
                        System.out.println("\n--- LISTA DOBLE ---");
                        System.out.println("1. Insertar Inicio");
                        System.out.println("2. Insertar Posicion");
                        System.out.println("3. Insertar Final");
                        System.out.println("4. Eliminar Inicio");
                        System.out.println("5. Eliminar Posicion");
                        System.out.println("6. Eliminar Final");
                        System.out.println("7. Recorrer adelante");
                        System.out.println("8. Recorrer Atras");
                        System.out.println("0. Volver");
                        System.out.println("Opcion: ");
                        opSub = sc.nextInt();

                        switch (opSub) {
                            case 1:
                                System.out.println("Dato: ");
                                dato = sc.nextInt();
                                ld.insertarInicio(dato);
                                break;
                            case 2:
                                System.out.println("Dato: ");
                                dato = sc.nextInt();
                                System.out.println("Posicion: ");
                                pos = sc.nextInt();
                                ld.insertarPosicion(dato, pos);
                                break;
                            case 3:
                                System.out.println("Dato: ");
                                dato = sc.nextInt();
                                ld.insertarFinal(dato);
                                break;
                            case 4:
                                ld.eliminarInicio();
                                break;
                            case 5:
                                System.out.println("Posicion: ");
                                pos = sc.nextInt();
                                ld.eliminarPosicion(pos);
                                break;
                            case 6:
                                ld.eliminarFinal();
                                break;
                            case 7:
                                ld.recorrerAdelante();
                                break;
                            case 8:
                                ld.recorrerAtras();
                                break;
                        }
                    } while (opSub != 0);
                    break;
                case 2:
                    do {
                        System.out.println("\n--- LISTA CIRCULAR ---");
                        System.out.println("1. Insertar Inicio");
                        System.out.println("2. Insertar Posicion");
                        System.out.println("3. Insertar Final");
                        System.out.println("4. Eliminar Inicio");
                        System.out.println("5. Eliminar Posicion");
                        System.out.println("6. Eliminar Final");
                        System.out.println("7. Recorrer");
                        System.out.println("0. Volver");
                        System.out.println("Opcion: ");
                        opSub = sc.nextInt();

                        switch (opSub) {
                            case 1:
                                System.out.println("Dato: ");
                                dato = sc.nextInt();
                                lc.insertarInicio(dato);
                                break;
                            case 2:
                                System.out.println("Dato: ");
                                dato = sc.nextInt();
                                System.out.println("Posicion: ");
                                pos = sc.nextInt();
                                lc.insertarPosicion(dato, pos);
                                break;
                            case 3:
                                System.out.println("Dato: ");
                                dato = sc.nextInt();
                                lc.insertarFinal(dato);
                                break;
                            case 4:
                                lc.eliminarInicio();
                                break;
                            case 5:
                                System.out.println("Posicion: ");
                                pos = sc.nextInt();
                                lc.eliminarPosicion(pos);
                                break;
                            case 6:
                                lc.eliminarFinal();
                                break;
                            case 7:
                                lc.recorrer();
                                break;
                        }
                    } while (opSub != 0);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while (opPrincipal != 0);
        sc.close();
    }
}
