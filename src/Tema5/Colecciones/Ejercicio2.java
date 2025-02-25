package Tema5.Colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

public class Ejercicio2 {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n1. Dar de alta usuario");
            System.out.println("2. Dar de baja usuario");
            System.out.println("3. Mostrar usuario");
            System.out.println("4. Modificar usuario");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    darDeAlta();
                    break;
                case 2:
                    darDeBaja();
                    break;
                case 3:
                    mostrarUsuario();
                    break;
                case 4:
                    modificarUsuario();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    private static void darDeAlta() {
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        usuarios.add(new Usuario(nombre, edad));
        System.out.println("Usuario agregado correctamente.");
    }

    private static void darDeBaja() {
        System.out.print("Introduce el nombre del usuario a eliminar: ");
        String nombre = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                usuarios.remove(usuario);
                System.out.println("Usuario eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró un usuario con ese nombre.");
    }

    private static void mostrarUsuario() {
        System.out.print("Introduce el nombre del usuario: ");
        String nombre = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(usuario);
                return;
            }
        }
        System.out.println("No se encontró un usuario con ese nombre.");
    }

    private static void modificarUsuario() {
        System.out.print("Introduce el nombre del usuario a modificar: ");
        String nombre = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                System.out.print("Nueva edad: ");
                int nuevaEdad = scanner.nextInt();
                scanner.nextLine();

                usuario.setNombre(nuevoNombre);
                usuario.setEdad(nuevaEdad);
                System.out.println("Usuario actualizado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró un usuario con ese nombre.");
    }
}