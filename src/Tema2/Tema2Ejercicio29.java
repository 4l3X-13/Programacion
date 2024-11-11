package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int numeroSecreto = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intento = 0;
        int numeroUsuario;


        System.out.println("¡Bienvenido al juego 'El número secreto'!");
        System.out.println("Adivina el número secreto entre 1 y 100.");


        while (intento != numeroSecreto) {
            System.out.print("Introduce un número: ");
            numeroUsuario = scanner.nextInt();


            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! Has acertado el número secreto.");
                break;
            }
        }


        scanner.close();
    }
}

