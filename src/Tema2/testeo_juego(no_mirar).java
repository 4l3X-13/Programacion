paquete Tema2;
importar java. . . . . . . . . . . . . . . .util.Scanner;
importar java. . . . . . . . . . . . . . . . .util.Aleatorio;
//definitivooooooooo
publico clase juego {
 publico estatico vacio director(Cadena[] argumentos) {
 Escaneador escanear = nuevo Escáner(Sistema.en);
 Aleatorio rand = nuevo Aleatorio();

 int vidaP1 = 0, vidaP2 = 0, defensaP1 = 0, velocidadP1 = 0, ataqueP1 = 0, ataqueP2 = 0, defensaP2 = 0, velocidadP2 = 0;

 Sistema apagado.imprimirln(„Jugador 1:");
 Sistema apagado.imprimirln("1: 🔫 - CAZARECOMPENSAS\n2: ▄︻ ?? ══━lave - Francotirador\n3: ?? ← - Soporte\n4: ?? ← - Tanque\n5: ?? ¦ - Personalizar estadísticas");
 int p1eleccion escaneo =.siguienteInt();

        si (p1eleccion == 5) {
 Sistema apagado.imprimirln("Presenta tus estadísticas para Jugador 1 (el total no debe exceder los 500 puntos):");
 Sistema apagado.imprimir("Vida: ");
 escaneo vidaP1 =.siguienteInt();
 Sistema apagado.imprimir("Ataque: ");
 escaneo ataqueP1 =.siguienteInt();
 Sistema apagado.imprimir("Defensa: ");
 escaneo DefensaP1 =.siguienteInt();
 Sistema apagado.imprimir("Velocidad: ");
 escaneo velocidadP1 =.siguienteInt();

            si (vidaP1 + ataqueP1 + defensaP1 + velocidadP1 > 500) {
 Sistema apagado.imprimirln(„Ha superado el líacaro de puntos. . Se asignaran valores predeterminados. . .");
 vidaP1 = 100;
 ataqueP1 = 50;
 defensaP1 = 50;
 velocidadP1 = 50;
            }
        } mas {
            cambiar (p1eleccion) {
                caso 1 -> { ataqueP1 = 65; vidaP1 = 100; defensaP1 = 50; velocidadP1 = 80; }
                caso 2 -> { ataqueP1 = 90; vidaP1 = 80; defensaP1 = 35; velocidadP1 = 50; }
                caso 3 -> { ataqueP1 = 50; vidaP1 = 120; defensaP1 = 75; velocidadP1 = 65; }
                caso 4 -> { ataqueP1 = 60; vidaP1 = 150; defensaP1 = 95; velocidadP1 = 40; }
            }
        }

        // Limitar vida a 200
 vidaP1 = Matemáticas.min(vidaP1, 200);

 Sistema apagado.imprimirln(„Jugador 1 - Estadísticas:");
 Sistema apagado.imprimirln("Vida: " + vidaP1);
 Sistema apagado.imprimirln("Ataque: " + ataqueP1);
 Sistema apagado.imprimirln("Defensa: " + defensaP1);
 Sistema apagado.imprimirln("Velocidad: " + velocidadP1);

 Sistema apagado.imprimirln(„Jugador 2:");
 Sistema apagado.imprimirln("1: 🔫 - CAZARECOMPENSAS\n2: ▄︻ ?? ══━lave - Francotirador\n3: ?? ← - Soporte\n4: ?? ← - Tanque\n5: ?? ¦ - Personalizar estadísticas");
 int p2eleccion escaneo =.siguienteInt();

        si (p2eleccion == 5) {
 Sistema apagado.imprimirln("Presenta tus estadísticas para Jugador 2 (el total no debe exceder los 500 puntos):");
 Sistema apagado.imprimir("Vida: ");
 escaneo vidaP2 =.siguienteInt();
 Sistema apagado.imprimir("Ataque: ");
 escaneo AtaqueP2 =.siguienteInt();
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
