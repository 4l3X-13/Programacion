package Tema2;

import java.util.Scanner;
import java.util.Random;

public class JUEGO {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // Variables de estadísticas
        int vidaP1 = 100, ataqueP1 = 50, defensaP1 = 50, velocidadP1 = 50;
        int vidaP2 = 100, ataqueP2 = 50, defensaP2 = 50, velocidadP2 = 50;

        // Elegir estadísticas para Jugador 1
        System.out.println("Jugador 1:");
        System.out.println("\n" +
                "░▒▓████████▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓████████▓▒░      ░▒▓███████▓▒░░▒▓████████▓▒░▒▓███████▓▒░ ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓███████▓▒░ ░▒▓██████▓▒░       ░▒▓█▓▒░▒▓████████▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓██████▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓██████▓▒░        ░▒▓███████▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░      ░▒▓█▓▒░▒▓██████▓▒░   \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓████████▓▒░▒▓████████▓▒░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░      ░▒▓█▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░ \n" +
                "                                                                                                                                                                                        \n" +
                "                                                                                                                                                                                        \n");
        System.out.println("1: 🔫 - CAZARECOMPENSAS\n2: ▄︻芫══━一 - Francotirador\n3: \uD83E\uDE79 - Support\n4: \uD83E\uDE96 - Tanque\n5: ⚙️ - Personalizar estadísticas");
        int opcion = scan.nextInt();

        if (opcion == 5) {
            System.out.println("Jugador 1, asigna tus estadísticas (máximo 500 puntos en total):");
            System.out.print("Vida: ");
            vidaP1 = scan.nextInt();
            System.out.print("Ataque: ");
            ataqueP1 = scan.nextInt();
            System.out.print("Defensa: ");
            defensaP1 = scan.nextInt();
            System.out.print("Velocidad: ");
            velocidadP1 = scan.nextInt();

            if (vidaP1 + ataqueP1 + defensaP1 + velocidadP1 > 500) {
                System.out.println("¡Te pasaste del límite! Se asignarán valores predeterminados.");
                vidaP1 = 100;
                ataqueP1 = 50;
                defensaP1 = 50;
                velocidadP1 = 50;
            }
        } else if (opcion == 1) {
            vidaP1 = 100; ataqueP1 = 65; defensaP1 = 50; velocidadP1 = 80;
        } else if (opcion == 2) {
            vidaP1 = 80; ataqueP1 = 90; defensaP1 = 35; velocidadP1 = 50;
        } else if (opcion == 3) {
            vidaP1 = 120; ataqueP1 = 50; defensaP1 = 75; velocidadP1 = 65;
        } else if (opcion == 4) {
            vidaP1 = 150; ataqueP1 = 60; defensaP1 = 95; velocidadP1 = 40;
        }

        System.out.println("Jugador 1 - Vida: " + vidaP1 + ", Ataque: " + ataqueP1 + ", Defensa: " + defensaP1 + ", Velocidad: " + velocidadP1);

        // Elegir estadísticas para Jugador 2
        System.out.println("Jugador 2:");
        System.out.println("\n" +
                "░▒▓████████▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓████████▓▒░      ░▒▓███████▓▒░░▒▓████████▓▒░▒▓███████▓▒░ ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓███████▓▒░ ░▒▓██████▓▒░       ░▒▓█▓▒░▒▓████████▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓██████▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓██████▓▒░        ░▒▓███████▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░      ░▒▓█▓▒░▒▓██████▓▒░   \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓████████▓▒░▒▓████████▓▒░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░      ░▒▓█▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░ \n" +
                "                                                                                                                                                                                        \n" +
                "                                                                                                                                                                                        \n");
        System.out.println("1: Cazarecompensas\n2: Francotirador\n3: Support\n4: Tanque\n5: Personalizar estadísticas");
        opcion = scan.nextInt();

        if (opcion == 5) {
            System.out.println("Jugador 2, asigna tus estadísticas (máximo 500 puntos en total):");
            System.out.print("Vida: ");
            vidaP2 = scan.nextInt();
            System.out.print("Ataque: ");
            ataqueP2 = scan.nextInt();
            System.out.print("Defensa: ");
            defensaP2 = scan.nextInt();
            System.out.print("Velocidad: ");
            velocidadP2 = scan.nextInt();

            if (vidaP2 + ataqueP2 + defensaP2 + velocidadP2 > 500) {
                System.out.println("¡Te pasaste del límite! Se asignarán valores predeterminados.");
                vidaP2 = 100;
                ataqueP2 = 50;
                defensaP2 = 50;
                velocidadP2 = 50;
            }
        } else if (opcion == 1) {
            vidaP2 = 100; ataqueP2 = 65; defensaP2 = 50; velocidadP2 = 80;
        } else if (opcion == 2) {
            vidaP2 = 80; ataqueP2 = 90; defensaP2 = 35; velocidadP2 = 50;
        } else if (opcion == 3) {
            vidaP2 = 120; ataqueP2 = 50; defensaP2 = 75; velocidadP2 = 65;
        } else if (opcion == 4) {
            vidaP2 = 150; ataqueP2 = 60; defensaP2 = 95; velocidadP2 = 40;
        }

        System.out.println("Jugador 2 - Vida: " + vidaP2 + ", Ataque: " + ataqueP2 + ", Defensa: " + defensaP2 + ", Velocidad: " + velocidadP2);

        System.out.println("¡Que comience el combate!");
        boolean turnoJugador1 = velocidadP1 >= velocidadP2;

        while (vidaP1 > 0 && vidaP2 > 0) {
            if (turnoJugador1) {
                System.out.println("Turno de Jugador 1:");
                System.out.println("Elige tu acción:\n1. Atacar\n2. Curarse\n3. Pasar turno");
                int accion = scan.nextInt();

                if (accion == 1) {
                    boolean critico = rand.nextInt(100) < 20;
                    int daño = critico ? (int) (ataqueP1 * 1.5) : ataqueP1;
                    System.out.println("¡Ataque realizado! Daño causado: " + daño);
                    vidaP2 -= daño;
                } else if (accion == 2) {
                    System.out.println("Te has curado 40 puntos de vida.");
                    vidaP1 += 40;
                } else {
                    System.out.println("Has pasado tu turno.");
                }
            } else {
                System.out.println("Turno de Jugador 2:");
                System.out.println("Elige tu acción:\n1. Atacar\n2. Curarse\n3. Pasar turno");
                int accion = scan.nextInt();

                if (accion == 1) {
                    boolean critico = rand.nextInt(100) < 20;
                    int daño = critico ? (int) (ataqueP2 * 1.5) : ataqueP2;
                    System.out.println("¡Ataque realizado! Daño causado: " + daño);
                    vidaP1 -= daño;
                } else if (accion == 2) {
                    System.out.println("Te has curado 40 puntos de vida.");
                    vidaP2 += 40;
                } else {
                    System.out.println("Has pasado tu turno.");
                }
            }

            System.out.println("Vida de Jugador 1: " + vidaP1);
            System.out.println("Vida de Jugador 2: " + vidaP2);

            turnoJugador1 = !turnoJugador1;
        }

        if (vidaP1 <= 0 && vidaP2 <= 0) {
            System.out.println("¡Es un empate!");
        } else if (vidaP1 <= 0) {
            System.out.println("¡Jugador 2 gana!");
        } else {
            System.out.println("¡Jugador 1 gana!");
        }
        scan.close();
    }
}
