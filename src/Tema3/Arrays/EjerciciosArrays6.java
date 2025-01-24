import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EjerciciosArrays6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear el tablero
        String[] tablero = new String[20];
        int[] minas = new int[20]; // Array para calcular las minas y las pistas
        boolean[] visibles = new boolean[20]; // Array para saber qué casillas están descubiertas
        Arrays.fill(minas, 0); // Inicializamos el array de minas a 0

        // Colocar las minas aleatoriamente
        Integer[] posiciones = new Integer[20];
        for (int i = 0; i < 20; i++) {
            posiciones[i] = i;
        }
        Collections.shuffle(Arrays.asList(posiciones)); // Mezclamos las posiciones
        for (int i = 0; i < 6; i++) {
            minas[posiciones[i]] = -1; // Las minas se representan con -1
        }

        // Calcular las pistas
        for (int i = 0; i < 20; i++) {
            if (minas[i] == -1) continue; // Si es una mina, no hacemos nada
            int contador = 0;
            if (i > 0 && minas[i - 1] == -1) contador++; // Izquierda
            if (i < 19 && minas[i + 1] == -1) contador++; // Derecha
            minas[i] = contador; // Guardamos la cantidad de minas cercanas
        }

 // Juego principal
 booleano juegoTerminado = falso;
 int casillasDescubiertas = 0;

 mientras (!juegoTerminado) {
 // Mostrar el tablero actual
 System.out.println("Tablero actual:");
 para (int i = 0; i < 20; i++) {
 if (visibles[i]) {
 System.out.printf("%-3s", minas[i] == -1 ? "*": minas[i]);
 } más {
 System.out.print("??? ");
                }
 if ((i + 1) % 5 == 0) System.out.println(); // Salto de línea cada 5 elementos
            }

 // Pedir al jugador que selección una posición
 System.out.print("Selección una posición (0-19): ");
 int posición = sc.nextInt();

 // Validar posición
 if (posición < 0 || posición >= 20 || visibles[posición]) {
 System.out.println("Posición inválida o ya descubierta. Intenta de nuevo.");
 continuă;
            }

 // Descubrir la posición seleccionada
 visibles[posición] = verdedero;

 if (minas[posición] == -1) {
 System.out.println("¡BOOM! Tiene pisado una mina. Ha perdido!");
 juegoTerminado = verdedero;
 } más {
 System.out.println("Casilla segura".);
 casillasDescubiertas++;

 // Si todas las casillas seguras están descubriertas, el jugador gana
 if (casillasDescubiertas == 20 - 6) {
 System.out.println("¡Felicidades! Ha descubierto todas las casillas seguras. Ha ganado!");
 juegoTerminado = verdedero;
                }
            }
        }

 // Mostrar el tablero final
 System.out.println("Tablero final:");
 para (int i = 0; i < 20; i++) {
 System.out.printf("%-3s", minas[i] == -1 ? "*": minas[i]);
 if ((i + 1) % 5 == 0) System.out.println(); // Salto de línea cada 5 elementos
        }

 sc.close();
    }
}
