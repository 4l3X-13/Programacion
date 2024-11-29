package Tema3.src;

import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seleccion = 0;
        double euro2dollar, dollar2euro;
        System.out.println("Inserta que quieres hacer:  (1. Euro2Dollar  2. Dollar2Euro  3. Salir)");
          
            do {
                seleccion = showMenu(); // Llama al procedimiento para obtener la opción del usuario
                switch (seleccion) {
                    case 1:
                        System.out.println("Introduce la cantidad en euros:"); // Leer valor, llamar a euro2dollar y mostrar resultado
                        break;
                    case 2:
                        System.out.println("Introduce la cantidad en dólares:"); // Leer valor, llamar a dollar2euro y mostrar resultado
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                }
            } while (seleccion != 3); // Salir si la opción es "3"
        }
        



    }


    public static int showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción:\n" +
                "1. Convertir de euros a dólares\n" +
                "2. Convertir de dólares a euros\n" +
                "3. Salir");
        int opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 3) {
            System.out.println("Opción inválida. Inténtelo de nuevo.");
            opcion = scanner.nextInt();
        }

        return opcion;
    }



