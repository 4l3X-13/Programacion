package tema7.FicherosYserialización;

import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        try (PrintWriter writer = new PrintWriter("usuario.txt")) {
            writer.println("Nombre: " + nombre);
            writer.println("Edad: " + edad);
            System.out.println("Datos guardados en usuario.txt");
        } catch (Exception e) {
            System.err.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }
}
