package Tema2;

import java.util.Scanner;

public class juego {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vidaP1 = 0, vidaP2 = 0, defensaP1 = 0,velocidadP1 = 0, ataqueP1 = 0, ataqueP2 = 0, defensaP2 = 0, velocidadP2;

        System.out.println("Jugador 1: ");
        System.out.println("                 ░▒▓████████▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓████████▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓███████▓▒░░▒▓████████▓▒░▒▓███████▓▒░ ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓███████▓▒░ ░▒▓██████▓▒░       ░▒▓█▓▒░▒▓████████▓▒░ \\n\" +\n" +
                "                \"░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \\n\" +\n" +
                "                \"░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \\n\" +\n" +
                "                \"░▒▓██████▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓██████▓▒░           ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓███████▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░      ░▒▓█▓▒░▒▓██████▓▒░   \\n\" +\n" +
                "                \"░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \\n\" +\n" +
                "                \"░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \\n\" +\n" +
                "                \"░▒▓████████▓▒░▒▓████████▓▒░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░         ░▒▓█▓▒░    ░▒▓██████▓▒░       ░▒▓█▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░ \\n\" +\n" +
                "                \"                                                                                                                                                                                                                         \\n\" +\n" +
                "                ");
        System.out.println("1:🔫 -CAZARECOMPENSAS\n2:▄︻芫══━一 -Francotirador\n3:🛡️ -Support\n4:🛡️ -Tanque");
        int p1eleccion = scan.nextInt();

        switch (p1eleccion) {
            case 1 -> { ataqueP1 = 75; vidaP1 = 100; defensaP1 = 50; velocidadP1 = 80;}
            case 2 -> { ataqueP1 = 90; vidaP1 = 80;defensaP1 = 35;velocidadP1 = 50;}
            case 3 -> { ataqueP1 = 50; vidaP1 = 120; defensaP1 = 75; velocidadP1 = 65;}
            case 4 -> { ataqueP1 = 60; vidaP1 = 150;defensaP1 = 95; velocidadP1 = 40;}
        }

        System.out.println("Jugador 2: ");
        System.out.println("                 ░▒▓████████▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓████████▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓███████▓▒░░▒▓████████▓▒░▒▓███████▓▒░ ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓███████▓▒░ ░▒▓██████▓▒░       ░▒▓█▓▒░▒▓████████▓▒░ \\n\" +\n" +
                "                \"░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \\n\" +\n" +
                "                \"░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \\n\" +\n" +
                "                \"░▒▓██████▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓██████▓▒░           ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓███████▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░      ░▒▓█▓▒░▒▓██████▓▒░   \\n\" +\n" +
                "                \"░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \\n\" +\n" +
                "                \"░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \\n\" +\n" +
                "                \"░▒▓████████▓▒░▒▓████████▓▒░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░         ░▒▓█▓▒░    ░▒▓██████▓▒░       ░▒▓█▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░ \\n\" +\n" +
                "                \"                                                                                                                                                                                                                         \\n\" +\n" +
                "                ");
        System.out.println("1:🔫 -CAZARECOMPENSAS\n2:▄︻芫══━一 -Francotirador\n3:🛡️ -Support\n4:🛡️" +
                " -Tanque");
        int p2eleccion = scan.nextInt();

        switch (p2eleccion) {
            case 1 -> { ataqueP2 = 75; vidaP2 = 100; }
            case 2 -> { ataqueP2 = 90; vidaP2 = 80; }
            case 3 -> { ataqueP2 = 50; vidaP2 = 120; }
            case 4 -> { ataqueP2 = 60; vidaP2 = 150; }
        }

        System.out.println("¡Que comience el combate!");

        boolean turnoP1 = true;
        while (vidaP1 > 0 && vidaP2 > 0) {
            if (turnoP1) {
                System.out.println("Turno de Jugador 1:");
                System.out.println("1. Atacar\n2. Curarse\n3. Saltar turno");
                int accion = scan.nextInt();

                switch (accion) {
                    case 1 -> {
                        System.out.println("Jugador 1 ataca a Jugador 2.");
                        vidaP2 -= ataqueP1;
                    }
                    case 2 -> {
                        System.out.println("Jugador 1 se cura.");
                        vidaP1 += 20;
                    }
                    case 3 -> System.out.println("Jugador 1 pasa su turno.");
                    default -> System.out.println("Acción inválida. Pierdes el turno.");
                }
            } else {

                System.out.println("Turno de Jugador 2:");
                System.out.println("1. Atacar\n2. Curarse\n3. Saltar turno");
                int accion = scan.nextInt();

                switch (accion) {
                    case 1 -> {
                        System.out.println("Jugador 2 ataca a Jugador 1.");
                        vidaP1 -= ataqueP2;
                    }
                    case 2 -> {
                        System.out.println("Jugador 2 se cura.");
                        vidaP2 += 20;
                    }
                    case 3 -> System.out.println("Jugador 2 pasa su turno.");
                    default -> System.out.println("Acción inválida. Pierdes el turno.");
                }
            }

            // Mostrar el estado de los jugadores
            System.out.println("Estado:");
            System.out.println("Jugador 1 - Vida: " + vidaP1);
            System.out.println("Jugador 2 - Vida: " + vidaP2);

            // Cambiar de turno
            turnoP1 = !turnoP1;
        }

        // Determinar el ganador
        if (vidaP1 <= 0 && vidaP2 <= 0) {
            System.out.println("¡Empate!");
        } else if (vidaP1 <= 0) {
            System.out.println("¡Jugador 2 gana!");
        } else {
            System.out.println("¡Jugador 1 gana!");
        }
    }
}
