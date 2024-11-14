package Tema2;

import java.util.Scanner;


public class JUEGO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p1eleccion;
        int velP1 = 0;
        int ataP1 = 0;

        System.out.println();
        System.out.println("Jugador 1\uFE0F⃣, elige personaje: ");
        System.out.println();
        System.out.println("░▒▓████████▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓████████▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓███████▓▒░░▒▓████████▓▒░▒▓███████▓▒░ ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓███████▓▒░ ░▒▓██████▓▒░       ░▒▓█▓▒░▒▓████████▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓██████▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓██████▓▒░           ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓███████▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░      ░▒▓█▓▒░▒▓██████▓▒░   \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓████████▓▒░▒▓████████▓▒░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░         ░▒▓█▓▒░    ░▒▓██████▓▒░       ░▒▓█▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░ \n" +
                "                                                                                                                                                                                                                         \n" +
                "                                                                                                                                                                                                                         ");
        System.out.println();
        System.out.println("1:🔫 -CAZARECOMPENSAS");
        System.out.println("2: " +
                "▄︻芫══━一" +
                "    -Francotirador");
        System.out.println("3: \uD83E\uDE79 -Support");
        System.out.println("4: \uD83E\uDE96 -Tanque");

        p1eleccion = scan.nextInt();

        //variables de CAZARRECOMPENSAS
        int ataqueCA1 = 75;
        int defensaCA1 = 60;
        int vidaCA1 = 100;
        int velocidadCA1 = 85;

        //variables de FRANCOTIRADOR
        int ataqueFR1 = 90;
        int defensaFR1 = 50;
        int vidaFR1 = 80;
        int velocidadFR1 = 65;

        //variables de SUPPORT
        int ataqueSUP1 = 50;
        int defensaSUP1 = 80;
        int vidaSUP1 = 120;
        int velocidadSUP1 = 60;

        //variables de TANQUE
        int ataqueTANQ1 = 60;
        int defensaTANQ1 = 90;
        int vidaTANQ1 = 150;
        int velocidadTANQ1 = 45;


        switch (p1eleccion) {
            case 1:
                System.out.println("¡HAS SELECCIONADO AL CAZARRECOMPENSAS!");
                System.out.println("");
                System.out.println("Tus estadísticas son las siguientes: ");
                System.out.println("");
                System.out.println("Ataque: " + ataqueCA1);
                System.out.println("Defensa: " + defensaCA1);
                System.out.println("Puntos de Vida: " + vidaCA1);
                System.out.println("Velocidad: " + velocidadCA1);
                break;

            case 2:
                System.out.println("¡HAS SELECCIONADO AL FRANCOTIRADOR!");
                System.out.println("");
                System.out.println("Tus estadísticas son las siguientes: ");
                System.out.println("");
                System.out.println("Ataque: " + ataqueFR1);
                System.out.println("Defensa: " + defensaFR1);
                System.out.println("Puntos de Vida: " + vidaFR1);
                System.out.println("Velocidad: " + velocidadFR1);
                break;

            case 3:
                System.out.println("¡HAS SELECCIONADO AL SUPPORT!");
                System.out.println("");
                System.out.println("Tus estadísticas son las siguientes: ");
                System.out.println("");
                System.out.println("Ataque: " + ataqueSUP1);
                System.out.println("Defensa: " + defensaSUP1);
                System.out.println("Puntos de Vida: " + vidaSUP1);
                System.out.println("Velocidad: " + velocidadSUP1);
                break;

            case 4:
                System.out.println("¡HAS SELECCIONADO AL TANQUE!");
                System.out.println("");
                System.out.println("Tus estadísticas son las siguientes: ");
                System.out.println("");
                System.out.println("Ataque: " + ataqueTANQ1);
                System.out.println("Defensa: " + defensaTANQ1);
                System.out.println("Puntos de Vida: " + vidaTANQ1);
                System.out.println("Velocidad: " + velocidadTANQ1);
                break;
        }

        System.out.println();
        System.out.println("Jugador 2\uFE0F⃣, elige personaje: ");
        System.out.println();
        System.out.println("░▒▓████████▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓████████▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓███████▓▒░░▒▓████████▓▒░▒▓███████▓▒░ ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓███████▓▒░ ░▒▓██████▓▒░       ░▒▓█▓▒░▒▓████████▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓██████▓▒░ ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓██████▓▒░           ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓███████▓▒░░▒▓██████▓▒░ ░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░      ░▒▓█▓▒░▒▓██████▓▒░   \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░        \n" +
                "░▒▓████████▓▒░▒▓████████▓▒░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░         ░▒▓█▓▒░    ░▒▓██████▓▒░       ░▒▓█▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓██████▓▒░░▒▓████████▓▒░ \n" +
                "                                                                                                                                                                                                                         \n" +
                "                                                                                                                                                                                                                         ");
        System.out.println();

        int ataP2 = 0;
        int velP2 = 0;
        int ataquePJ1 = 0;

        System.out.println("1:🔫 -CAZARECOMPENSAS");
        System.out.println("2: " +
                "▄︻芫══━一" +
                "    -Francotirador");
        System.out.println("3: \uD83E\uDE79 -Support");
        System.out.println("4: \uD83E\uDE96 -Tanque");

        int p2eleccion = scan.nextInt();

        //variables de CAZARRECOMPENSAS
        int ataqueCA2 = 75;
        int defensaCA2 = 60;
        int vidaCA2 = 100;
        int velocidadCA2 = 85;

        //variables de FRANCOTIRADOR
        int ataqueFR2 = 90;
        int defensaFR2 = 50;
        int vidaFR2 = 80;
        int velocidadFR2 = 65;

        //variables de SUPPORT
        int ataqueSUP2 = 50;
        int defensaSUP2 = 80;
        int vidaSUP2 = 120;
        int velocidadSUP2 = 60;

        //variables de TANQUE
        int ataqueTANQ2 = 60;
        int defensaTANQ2 = 90;
        int vidaTANQ2 = 150;
        int velocidadTANQ2 = 45;


        switch (p2eleccion) {
            case 1:
                System.out.println("¡HAS SELECCIONADO AL CAZARRECOMPENSAS!");
                System.out.println("");
                System.out.println("Tus estadísticas son las siguientes: ");
                System.out.println("");
                System.out.println("Ataque: " + ataqueCA2);
                System.out.println("Defensa: " + defensaCA2);
                System.out.println("Puntos de Vida: " + vidaCA2);
                System.out.println("Velocidad: " + velocidadCA2);
                break;

            case 2:
                System.out.println("¡HAS SELECCIONADO AL FRANCOTIRADOR!");
                System.out.println("");
                System.out.println("Tus estadísticas son las siguientes: ");
                System.out.println("");
                System.out.println("Ataque: " + ataqueFR2);
                System.out.println("Defensa: " + defensaFR2);
                System.out.println("Puntos de Vida: " + vidaFR2);
                System.out.println("Velocidad: " + velocidadFR2);
                break;

            case 3:
                System.out.println("¡HAS SELECCIONADO AL SUPPORT!");
                System.out.println("");
                System.out.println("Tus estadísticas son las siguientes: ");
                System.out.println("");
                System.out.println("Ataque: " + ataqueSUP2);
                System.out.println("Defensa: " + defensaSUP2);
                System.out.println("Puntos de Vida: " + vidaSUP2);
                System.out.println("Velocidad: " + velocidadSUP2);
                break;

            case 4:
                System.out.println("¡HAS SELECCIONADO AL TANQUE!");
                System.out.println("");
                System.out.println("Tus estadísticas son las siguientes: ");
                System.out.println("");
                System.out.println("Ataque: " + ataqueTANQ2);
                System.out.println("Defensa: " + defensaTANQ2);
                System.out.println("Puntos de Vida: " + vidaTANQ2);
                System.out.println("Velocidad: " + velocidadTANQ2);
                break;
        }

        System.out.println("");
        System.out.println("░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░░▒▓███████▓▒░ ░▒▓██████▓▒░          ░▒▓█▓▒░ \n" +
                "   ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓████▓▒░ \n" +
                "   ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░         ░▒▓█▓▒░ \n" +
                "   ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░         ░▒▓█▓▒░ \n" +
                "   ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░         ░▒▓█▓▒░ \n" +
                "   ░▒▓█▓▒░   ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░         ░▒▓█▓▒░ \n" +
                "   ░▒▓█▓▒░    ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓██████▓▒░          ░▒▓█▓▒░ \n" +
                "                                                                                   \n" +
                "                                                                                   ");
        System.out.println("");

        //comparación de velocidad PJ1

        switch (p1eleccion) {
            case 1:
                velP1 = velocidadCA1;
                break;
            case 2:
                velP1 = velocidadFR1;
                break;
            case 3:
                velP1 = velocidadSUP1;
                break;
            case 4:
                velP1 = velocidadTANQ1;
                break;
        }

        //comparación de velocidad PJ2

        switch (p2eleccion) {
            case 1:
                velP2 = velocidadCA2;
                break;
            case 2:
                velP2 = velocidadFR2;
                break;
            case 3:
                velP2 = velocidadSUP2;
                break;
            case 4:
                velP2 = velocidadTANQ2;
                break;


        }
        if (velP1 > velP2) {
            System.out.println("¡Jugador 1 empieza atacando!");
        } else if (velP1 < velP2) {
            System.out.println("¡Jugador 2 empieza atacando!");
        }

        switch (p1eleccion) {
            case 1:
                ataP1 = ataqueCA1;
                break;
            case 2:
                ataP1 = ataqueFR1;
                break;
            case 3:
                ataP1 = ataqueSUP1;
                break;
            case 4:
                ataP1 = ataqueTANQ1;
                break;

        }
        switch (p1eleccion) {
            case 1:
                ataP2 = ataqueCA2;
                break;
            case 2:
                ataP2 = ataqueFR2;
                break;
            case 3:
                ataP2 = ataqueSUP2;
                break;
            case 4:
                ataP2 = ataqueTANQ2;
                break;

        }

        System.out.println("");
        System.out.println("");
        System.out.println("Elije la acción que quieres hacer: ");
        System.out.println("- Atacar");
        System.out.println("- Curarse");
        System.out.println("- Pasar turno");


        switch (p1eleccion) {
            case 1:
                switch (p2eleccion) {
                    case 1:
                        ataquePJ1 = ataqueCA1;
                        break;
                    case 2:
                        ataquePJ1 = ataqueFR1;
                        break;
                    case 3:
                        ataquePJ1 = ataqueSUP1;
                        break;
                    case 4:
                        ataquePJ1 = ataqueTANQ1;
                        break;

                }


                if (velP1 > velP2) {

                    // Determinar el daño que recibe el jugador 2
                    int dañoP1 = 0;
                    switch (p1eleccion) {
                        case 1:
                            dañoP1 = ataqueCA1 - defensaCA2;
                            break;
                        case 2:
                            dañoP1 = ataqueFR1 - defensaFR2;
                            break;
                        case 3:
                            dañoP1 = ataqueSUP1 - defensaSUP2;
                            break;
                        case 4:
                            dañoP1 = ataqueTANQ1 - defensaTANQ2;
                            break;
                    }

                    // Asegurarse de que el daño no sea negativo
                    if (dañoP1 < 0) {
                        dañoP1 = 0;
                    }

                    // Aplicar daño al jugador 2
                    switch (p2eleccion) {
                        case 1:
                            vidaCA2 -= dañoP1;
                            break;
                        case 2:
                            vidaFR2 -= dañoP1;
                            break;
                        case 3:
                            vidaSUP2 -= dañoP1;
                            break;
                        case 4:
                            vidaTANQ2 -= dañoP1;
                            break;
                    }

                    System.out.println("¡Jugador 1 ha atacado a Jugador 2!");
                    System.out.println("Jugador 2 ha recibido " + dañoP1 + " puntos de daño.");
                } else if (velP2 > velP1) {
                    // Personaje 2 ataca primero
                    System.out.println("¡El Jugador 2 ataca primero!");

                    // Determinar el daño que recibe el jugador 1
                    int dañoP2 = 0;
                    switch (p2eleccion) {
                        case 1:
                            dañoP2 = ataqueCA2 - defensaCA1;
                            break;
                        case 2:
                            dañoP2 = ataqueFR2 - defensaFR1;
                            break;
                        case 3:
                            dañoP2 = ataqueSUP2 - defensaSUP1;
                            break;
                        case 4:
                            dañoP2 = ataqueTANQ2 - defensaTANQ1;
                            break;
                    }

                    // Asegurarse de que el daño no sea negativo
                    if (dañoP2 < 0) {
                        dañoP2 = 0;
                    }

                    // Aplicar daño al jugador 1
                    switch (p1eleccion) {
                        case 1:
                            vidaCA1 -= dañoP2;
                            break;
                        case 2:
                            vidaFR1 -= dañoP2;
                            break;
                        case 3:
                            vidaSUP1 -= dañoP2;
                            break;
                        case 4:
                            vidaTANQ1 -= dañoP2;
                            break;
                    }

                    System.out.println("¡Jugador 2 ha atacado a Jugador 1!");
                    System.out.println("Jugador 1 ha recibido " + dañoP2 + " puntos de daño.");
                } else {
                    // Si las velocidades son iguales, se resuelve al azar quién ataca primero
                    System.out.println("¡Ambos jugadores tienen la misma velocidad! El ataque se resuelve al azar.");

                    // Generar un número aleatorio entre 1 y 2 para determinar el atacante
                    int atacante = (int) (Math.random() * 2) + 1;

                    if (atacante == 1) {
                        // Jugador 1 ataca primero

                        int dañoP1 = 0;
                        switch (p1eleccion) {
                            case 1:
                                dañoP1 = ataqueCA1 - defensaCA2;
                                break;
                            case 2:
                                dañoP1 = ataqueFR1 - defensaFR2;
                                break;
                            case 3:
                                dañoP1 = ataqueSUP1 - defensaSUP2;
                                break;
                            case 4:
                                dañoP1 = ataqueTANQ1 - defensaTANQ2;
                                break;
                        }

                        if (dañoP1 < 0) {
                            dañoP1 = 0;
                        }

                        switch (p2eleccion) {
                            case 1:
                                vidaCA2 -= dañoP1;
                                break;
                            case 2:
                                vidaFR2 -= dañoP1;
                                break;
                            case 3:
                                vidaSUP2 -= dañoP1;
                                break;
                            case 4:
                                vidaTANQ2 -= dañoP1;
                                break;
                        }

                        System.out.println("¡Jugador 1 ha atacado a Jugador 2!");
                        System.out.println("");
                        System.out.println("Jugador 2 ha recibido " + dañoP1 + " puntos de daño.");
                    } else {
                        // Jugador 2 ataca primero
                        System.out.println("¡El Jugador 2 ataca primero!");

                        int dañoP2 = 0;
                        switch (p2eleccion) {
                            case 1:
                                dañoP2 = ataqueCA2 - defensaCA1;
                                break;
                            case 2:
                                dañoP2 = ataqueFR2 - defensaFR1;
                                break;
                            case 3:
                                dañoP2 = ataqueSUP2 - defensaSUP1;
                                break;
                            case 4:
                                dañoP2 = ataqueTANQ2 - defensaTANQ1;
                                break;
                        }

                        if (dañoP2 < 0) {
                            dañoP2 = 0;
                        }

                        switch (p1eleccion) {
                            case 1:
                                vidaCA1 -= dañoP2;
                                break;
                            case 2:
                                vidaFR1 -= dañoP2;
                                break;
                            case 3:
                                vidaSUP1 -= dañoP2;
                                break;
                            case 4:
                                vidaTANQ1 -= dañoP2;
                                break;
                        }

                        System.out.println("¡Jugador 2 ha atacado a Jugador 1!");
                        System.out.println("Jugador 1 ha recibido " + dañoP2 + " puntos de daño.");
                    }
                }






        }

    }

}



