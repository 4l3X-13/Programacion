import java.util.Scanner;

public class EjercicioStrings4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palabraSecreta = "hueso";
        int maxIntentos = 5;

        System.out.println("Bienvenido al juego del Lingo. Tienes que adivinar una palabra de 5 letras.");
        System.out.println("Tienes un máximo de " + maxIntentos + " intentos. Buena suerte!");

        boolean palabraAdivinada = false;

        for (int intento = 1; intento <= maxIntentos; intento++) {
            System.out.println("\nIntento " + intento + " de " + maxIntentos + ":");
            System.out.print("Introduce una palabra de 5 letras: ");
            String palabraIntento = teclado.nextLine().toLowerCase();

            if (palabraIntento.length() != 5) {
                System.out.println("La palabra debe tener exactamente 5 letras. Inténtalo de nuevo.");
                intento--;
                continue;
            }

            if (palabraIntento.equals(palabraSecreta)) {
                System.out.println("\u00a1Felicidades! Has adivinado la palabra: " + palabraSecreta);
                palabraAdivinada = true;
                break;
            }

            String pista = generarPista(palabraIntento, palabraSecreta);
            System.out.println("Pista: " + pista);
        }

        if (!palabraAdivinada) {
            System.out.println("\nLo siento, no has adivinado la palabra. La palabra secreta era: " + palabraSecreta);
        }

        teclado.close();
    }

    public static String generarPista(String intento, String secreta) {
        char[] pista = new char[5];
        boolean[] letrasUsadas = new boolean[5];

        for (int i = 0; i < 5; i++) {
            pista[i] = '-';
        }

        for (int i = 0; i < 5; i++) {
            if (intento.charAt(i) == secreta.charAt(i)) {
                pista[i] = '*';
                letrasUsadas[i] = true;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (pista[i] == '-') {
                for (int j = 0; j < 5; j++) {
                    if (!letrasUsadas[j] && intento.charAt(i) == secreta.charAt(j)) {
                        pista[i] = '*';
                        letrasUsadas[j] = true;
                        break;
                    }
                }
            }
        }

        return new String(pista);
    }
}
