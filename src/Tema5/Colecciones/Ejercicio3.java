package Programacion;
import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nombre;
    int edad;
    String dni;

    Usuario(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String toString() {
        return nombre + " - " + edad + " años - DNI: " + dni;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Usuario> cola = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Añadir usuario");
            System.out.println("2. Atender usuario");
            System.out.println("3. Eliminar usuario por DNI");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("DNI: ");
                    String dni = scanner.nextLine();
                    cola.add(new Usuario(nombre, edad, dni));
                    break;
                case 2:
                    if (!cola.isEmpty()) {
                        System.out.println("Atendido: " + cola.remove(0));
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 3:
                    System.out.print("DNI a eliminar: ");
                    String dniEliminar = scanner.nextLine();
                    cola.removeIf(u -> u.dni.equals(dniEliminar));
                    break;
                case 4:
                    System.out.println("Cola:");
                    for (Usuario u : cola) System.out.println(u);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
