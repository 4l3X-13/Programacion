package Programacion.Excepciones;
import java.util.ArrayList;
import java.util.Scanner;

class Gato1 { //he puesto Gato1 y no Gato porque me daba error
    private String nombre;
    private int edad;

    public Gato1(String nombre, int edad) {
        if (nombre.length() < 3) {
            throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres.");
        }
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Gato: " + nombre + ", Edad: " + edad + " años.");
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>();

        while (gatos.size() < 5) {
            try {
                System.out.print("Introduce el nombre del gato (al menos 3 caracteres): ");
                String nombre = scanner.nextLine();

                System.out.print("Introduce la edad del gato (no negativa): ");
                int edad = scanner.nextInt();
                scanner.nextLine();


                Gato gato = new Gato(nombre, edad);
                gatos.add(gato);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error desconocido: " + e.getMessage());
            }
        }

        System.out.println("\nGatos almacenados:");
        for (Gato gato : gatos) {
            gato.imprimir();
        }

        scanner.close();
    }
}
