package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejecicio28 {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);


            int numeroGanador = random.nextInt(100000);
            System.out.println("¡El número ganador ha sido generado!");


            for (int i = 1; i <= 5; i++) {
                System.out.print("Introduce tu número de lotería (intento " + i + "): ");
                int numeroUsuario = scanner.nextInt();


                if (numeroUsuario == numeroGanador) {
                    System.out.println("¡Felicidades! Has ganado la lotería.");
                    break;
                } else {
                    System.out.println("Lo siento, no has ganado la lotería.");
                }


                if (i == 5) {
                    System.out.println("Se acabaron los intentos. El número ganador era: " + numeroGanador);
                }
            }


            scanner.close();
        }
    }


