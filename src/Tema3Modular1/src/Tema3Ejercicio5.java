package Tema3Modular1.src;
import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero del 1 al 10: ");
        int numero = scanner.nextInt();
        int numentero = entero(numero);
        scanner.close();
    }

    public static int entero(int numero) {
        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("Por favor, introduce un número válido entre 1 y 10.");
        }


        return numero;
    }


}

