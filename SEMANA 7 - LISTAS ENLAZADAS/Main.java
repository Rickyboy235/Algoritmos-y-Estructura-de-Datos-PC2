
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        
        int opcion, dato, posicion;
        
        do {
            System.out.println("\n MENU LISTA ENLAZADA ");
            System.out.println("1. Insertar al inicio ");
            System.out.println("2. Insertar al final ");
            System.out.println("3. Insertar en una posición ");
            System.out.println("4. Eliminar al inicio ");
            System.out.println("5. Eliminar por valor ");
            System.out.println("6. Eliminar en una posición ");
            System.out.println("7. Mostrar lista ");
            System.out.println("8. Salir ");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese dato: ");
                    dato = sc.nextInt();
                    lista.insertarInicio(dato);
                    break;
                case 2:
                    System.out.println("Ingrese dato: ");
                    dato = sc.nextInt();
                    lista.insertarFinal(dato);
                    break;
                case 3:
                    System.out.println("Ingrese dato: ");
                    dato = sc.nextInt();
                    System.out.println("Ingrese posicion: ");
                    posicion = sc.nextInt();
                    lista.insertarEnPosicion(dato, posicion);
                    break;
                case 4:
                    lista.eliminarInicio();
                    break;
                case 5:
                    System.out.println("Ingrese dato a eliminar: ");
                    dato = sc.nextInt();
                    lista.eliminar(dato);
                    break;
                case 6:
                    System.out.println("Ingrese posicion a eliminar: ");
                    posicion = sc.nextInt();
                    lista.eliminarEnPosicion(posicion);
                    break;
                case 7:
                    lista.mostrar();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion inválida");
            }
        } while (opcion != 6);
        
        sc.close();
    } 
}
