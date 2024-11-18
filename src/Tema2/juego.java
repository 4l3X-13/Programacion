package Tema2;
import java.util.Scanner;
import java.util.Random;
//definitivoooooooooo
public class juego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int vidaP1 = 0, vidaP2 = 0, defensaP1 = 0, velocidadP1 = 0, ataqueP1 = 0, ataqueP2 = 0, defensaP2 = 0, velocidadP2 = 0;

        System.out.println("Jugador 1: ");
        System.out.println("1: 🔫 - CAZARECOMPENSAS\n2: ▄︻芫══━一 - Francotirador\n3: 🛡️ - Support\n4: 🛡️ - Tanque\n5: ⚙️ - Personalizar estadísticas");
        int p1eleccion = scan.nextInt();

        if (p1eleccion == 5) {
            System.out.println("Introduce tus estadísticas para Jugador 1 (el total no debe exceder 500 puntos):");
            System.out.print("Vida: ");
            vidaP1 = scan.nextInt();
            System.out.print("Ataque: ");
            ataqueP1 = scan.nextInt();
            System.out.print("Defensa: ");
            defensaP1 = scan.nextInt();
            System.out.print("Velocidad: ");
            velocidadP1 = scan.nextInt();

            if (vidaP1 + ataqueP1 + defensaP1 + velocidadP1 > 500) {
                System.out.println("Has excedido el límite de puntos. Se asignarán valores predeterminados.");
                vidaP1 = 100;
                ataqueP1 = 50;
                defensaP1 = 50;
                velocidadP1 = 50;
            }
        } else {
            switch (p1eleccion) {
                case 1 -> { ataqueP1 = 65; vidaP1 = 100; defensaP1 = 50; velocidadP1 = 80; }
                case 2 -> { ataqueP1 = 90; vidaP1 = 80; defensaP1 = 35; velocidadP1 = 50; }
                case 3 -> { ataqueP1 = 50; vidaP1 = 120; defensaP1 = 75; velocidadP1 = 65; }
                case 4 -> { ataqueP1 = 60; vidaP1 = 150; defensaP1 = 95; velocidadP1 = 40; }
            }
        }

        // Limitar vida a 200
        vidaP1 = Math.min(vidaP1, 200);

        System.out.println("Jugador 1 - Estadísticas:");
        System.out.println("Vida: " + vidaP1);
        System.out.println("Ataque: " + ataqueP1);
        System.out.println("Defensa: " + defensaP1);
        System.out.println("Velocidad: " + velocidadP1);

        System.out.println("Jugador 2: ");
        System.out.println("1: 🔫 - CAZARECOMPENSAS\n2: ▄︻芫══━一 - Francotirador\n3: 🛡️ - Support\n4: 🛡️ - Tanque\n5: ⚙️ - Personalizar estadísticas");
        int p2eleccion = scan.nextInt();

        if (p2eleccion == 5) {
            System.out.println("Introduce tus estadísticas para Jugador 2 (el total no debe exceder 500 puntos):");
            System.out.print("Vida: ");
            vidaP2 = scan.nextInt();
            System.out.print("Ataque: ");
            ataqueP2 = scan.nextInt();
            System.out.print("Defensa: ");
            defensaP2 = scan.nextInt();
            System.out.print("Velocidad: ");
            velocidadP2 = scan.nextInt();

            if (vidaP2 + ataqueP2 + defensaP2 + velocidadP2 > 500) {
                System.out.println("Has excedido el límite de puntos. Se asignarán valores predeterminados.");
                vidaP2 = 100;
                ataqueP2 = 50;
                defensaP2 = 50;
                velocidadP2 = 50;
            }
        } else {
            switch (p2eleccion) {
                case 1 -> { ataqueP2 = 65; vidaP2 = 100; defensaP2 = 50; velocidadP2 = 80; }
                case 2 -> { ataqueP2 = 90; vidaP2 = 80; defensaP2 = 35; velocidadP2 = 50; }
                case 3 -> { ataqueP2 = 50; vidaP2 = 120; defensaP2 = 75; velocidadP2 = 65; }
                case 4 -> { ataqueP2 = 60; vidaP2 = 150; defensaP2 = 95; velocidadP2 = 40; }
            }
        }

        // Limitar vida a 200
        vidaP2 = Math.min(vidaP2, 200);

        System.out.println("Jugador 2 - Estadísticas:");
        System.out.println("Vida: " + vidaP2);
        System.out.println("Ataque: " + ataqueP2);
        System.out.println("Defensa: " + defensaP2);
        System.out.println("Velocidad: " + velocidadP2);

        System.out.println("¡Que comience el combate!");

        boolean turnoP1 = velocidadP1 >= velocidadP2;

        while (vidaP1 > 0 && vidaP2 > 0) {
            int daño = 0;
            if (turnoP1) {
                System.out.println("Turno de Jugador 1:");
                System.out.println("1. Atacar\n2. Curarse\n3. Saltar turno");
                int accion = scan.nextInt();

                switch (accion) {
                    case 1 -> {
                        boolean critico = rand.nextInt(100) < 20;
                        daño = critico ? (int) (ataqueP1 * 1.5) : ataqueP1;
                        daño = Math.max(0, daño - defensaP2);
                        if (critico) System.out.println("¡Golpe crítico! Daño aumentado.");
                        System.out.println("Jugador 1 ataca con un daño de " + daño);
                    }
                    case 2 -> {
                        if (vidaP1 == 200) {
                            System.out.println("Jugador 1 ya tiene 200 de vida, no puede curarse.");
                        } else {
                            System.out.println("Jugador 1 se cura.");
                            daño = -40;
                            // Limitar vida al curarse
                            vidaP1 = Math.min(vidaP1 - daño, 200);
                        }
                    }
                    case 3 -> System.out.println("Jugador 1 pasa su turno.");
                    default -> System.out.println("Acción inválida. Pierdes el turno.");
                }
                vidaP2 -= daño;
            } else {
                System.out.println("Turno de Jugador 2:");
                System.out.println("1. Atacar\n2. Curarse\n3. Saltar turno");
                int accion = scan.nextInt();

                switch (accion) {
                    case 1 -> {
                        boolean critico = rand.nextInt(100) < 20;
                        daño = critico ? (int) (ataqueP2 * 1.5) : ataqueP2;
                        daño = Math.max(0, daño - defensaP1);
                        if (critico) System.out.println("¡Golpe crítico! Daño aumentado.");
                        System.out.println("Jugador 2 ataca con un daño de " + daño);
                    }
                    case 2 -> {
                        if (vidaP2 == 200) {
                            System.out.println("Jugador 2 ya tiene 200 de vida, no puede curarse.");
                        } else {
                            System.out.println("Jugador 2 se cura.");
                            daño = -40;
                            // Limitar vida al curarse
                            vidaP2 = Math.min(vidaP2 - daño, 200);
                        }
                    }
                    case 3 -> System.out.println("Jugador 2 pasa su turno.");
                    default -> System.out.println("Acción inválida. Pierdes el turno.");
                }
                vidaP1 -= daño;
            }

            System.out.println("Estado:");
            System.out.println("Jugador 1 - Vida: " + vidaP1);
            System.out.println("Jugador 2 - Vida: " + vidaP2);

            turnoP1 = !turnoP1;
        }

        if (vidaP1 <= 0 && vidaP2 <= 0) {
            System.out.println("¡Empate!");
        } else if (vidaP1 <= 0) {
            System.out.println("¡Jugador 2 gana!");
        } else {
            System.out.println("¡Jugador 1 gana!");
        }
    }
}
