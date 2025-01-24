import java.util.Scanner;

public class EjercicioStrings3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar palabra al primer jugador
        System.out.println("Jugador 1, introduce la palabra secreta: ");
        String palabraSecreta = teclado.nextLine().toLowerCase();

        // Limpiar la consola simuladamente
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        // Inicializar configuración del juego
        char[] palabraOculta = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }

        int intentosRestantes = 6;
        boolean palabraAdivinada = false;

        System.out.println("Jugador 2, comienza el juego del ahorcado.");

        while (intentosRestantes > 0 && !palabraAdivinada) {
            // Mostrar el estado actual del juego
            System.out.println("Palabra: " + String.valueOf(palabraOculta));
            System.out.println("Intentos restantes: " + intentosRestantes);
            mostrarAhorcado(6 - intentosRestantes);

            System.out.println("Introduce una letra (o escribe 'resolver' para adivinar la palabra completa):");
            String entradaUsuario = teclado.nextLine().toLowerCase();

            if (entradaUsuario.equals("resolver")) {
                System.out.println("¿Cuál es la palabra secreta?");
                String palabraIntento = teclado.nextLine().toLowerCase();

                if (palabraIntento.equals(palabraSecreta)) {
                    palabraAdivinada = true;
                } else {
                    System.out.println("Palabra incorrecta.");
                    intentosRestantes--;
                }
            } else if (entradaUsuario.length() == 1) {
                char letraIngresada = entradaUsuario.charAt(0);
                boolean letraAcertada = false;

                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letraIngresada && palabraOculta[i] == '_') {
                        palabraOculta[i] = letraIngresada;
                        letraAcertada = true;
                    }
                }

                if (!letraAcertada) {
                    System.out.println("Letra incorrecta.");
                    intentosRestantes--;
                }
            } else {
                System.out.println("Entrada no válida. Inténtalo de nuevo.");
            }

            // Verificar si la palabra ha sido adivinada
            if (String.valueOf(palabraOculta).equals(palabraSecreta)) {
                palabraAdivinada = true;
            }
        }

        // Resultado final del juego
        if (palabraAdivinada) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("Has perdido. La palabra era: " + palabraSecreta);
            mostrarAhorcado(6);
        }

        teclado.close();
    }

    public static void mostrarAhorcado(int errores) {
        switch (errores) {
            case 0:
                System.out.println("\n\n\n\n\n");
                break;
            case 1:
                System.out.println("\n\n\n\n   / ");
                break;
            case 2:
                System.out.println("\n\n\n\n   / \\");
                break;
            case 3:
                System.out.println("\n   |\n   |\n   |\n   / \\");
                break;
            case 4:
                System.out.println("   ____\n   |\n   |\n   |\n   / \\");
                break;
            case 5:
                System.out.println("   ____\\n   |  |\\n   |\\n   |\\n   / \\");
                break;
            case 6:
                System.out.println("   ____\\n   |  |\\n   |  O\\n   | /|\\\\\\n   / \\");
                break;
        }

    }
}
