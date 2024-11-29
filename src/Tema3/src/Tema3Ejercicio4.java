package Tema3.src;

import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu();


    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int seleccion;


            System.out.println("Inserta que quieres hacer:  (1. Dollar2Euro  2. Euro2Dollar  3. Salir)");
            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Has elegido de dollar a euro.");
                    System.out.println("Inserta cuantos dólares tienes:");
                    double dollars = scanner.nextDouble();
                    double euros = dollar2euro(dollars); // Llamada con parámetro
                    System.out.printf("%.2f dólares son %.2f euros%n", dollars, euros);
                    break;

                case 2:
                    System.out.println("Has elegido de euro a dollar.");
                    System.out.println("Inserta cuantos euros tienes:");
                    double eurosInput = scanner.nextDouble();
                    double dollarsOutput = euro2dollar(eurosInput); // Llamada con parámetro
                    System.out.printf("%.2f euros son %.2f dólares%n", eurosInput, dollarsOutput);
                    break;

                case 3:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    break;

            }

    }

    public static double dollar2euro(double totalDollars) {
        return totalDollars * 0.95; // Conversión de dólares a euros
    }

    public static double euro2dollar(double totalEuros) {
        return totalEuros / 0.95; // Conversión de euros a dólares
    }
}
    
