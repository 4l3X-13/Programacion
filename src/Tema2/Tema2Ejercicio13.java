package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las horas (0-23): ");
        int horas = scanner.nextInt();
        System.out.print("Ingrese los minutos (0-59): ");
        int minutos = scanner.nextInt();
        System.out.print("Ingrese los segundos (0-59): ");
        int segundos = scanner.nextInt();

        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("Hora inválida. Asegúrese de que las horas estén entre 0 y 23, los minutos y segundos entre 0 y 59.");
            return;
        }

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }

        if (minutos == 60) {
            minutos = 0;
            horas++;
        }

        if (horas == 24) {
            horas = 0;
        }

        System.out.printf("La nueva hora es: %02d:%02d:%02d%n", horas, minutos, segundos);

        scanner.close();
    }
}
