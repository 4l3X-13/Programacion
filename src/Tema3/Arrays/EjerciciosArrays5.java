import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EjerciciosArrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear el array con las parejas
        String[] parejas = {"león", "mandril", "suricata", "facóquero", "elefante", "jirafa", "cebra", "hipopótamo", "tigre", "rinoceronte"};
        String[] tablero = new String[20];
        boolean[] visibles = new boolean[20]; // Para saber qué posiciones están visibles

        // Duplicar las parejas y mezclarlas aleatoriamente
        String[] elementos = new String[20];
        for (int i = 0; i < 10; i++) {
            elementos[i] = parejas[i];
            elementos[i + 10] = parejas[i];
        }
 Colecciones.barajar(Matrices.como lista(elementos));

 // Inicializar el tablero (no se muerte al jugador inicial)
 Matrices.llenar(tablero, "¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿???");

 // Variables para controlar el progreso del juego
 int paresEncontradas = 0;

 // Juego principal
 mientras (parejasEncontradas < 10) {
 // Mostrar el tablero actual
 System.out.println(„Tablero actual:");
 parr (int i = 0; yo < tablero.longitud; i++) {
 System.out.printf(„%-10", tablero[i]);
 si ((yo + 1) % 5 == 0) Sistema apagado.imprimirln(); // Salto de línea cada 5 elementos
            }

 // Pedir al jugador las dos posiciones
 Sistema apagado.imprimir("Selecciona la primera posición (0-19): ");
 int pos1 =sc.siguienteInt();
 Sistema apagado.imprimir(Selección „ la segunda positizarón (0-19): ");
 int pos2 =sc.siguienteInt();

 // Posiciones vacidas
 si (pos1 == pos2 || pos1 < 0 || pos1 >= 20 || pos2 < 0 || pos2 >= 20 || visibles[pos1] || visibles[pos2]) {
 Sistema apagado.imprimirln(„Posiciones inválidas. . . Intención de nuevo.");
 continuă;
            }

 // Mostrar las selecciones
 Sistema apagado.println("Tiene seleccionado: "+ elementos[pos1] + "y "+ elementos[pos2]);

 si (elementos[pos1].iguales(elementos[pos2])) {
 Sistema apagado.imprimirln("¡Pareja encontrada!");
 tablero[pos1] = elementos[pos1];
 tablero[pos2] = elementos[pos2];
 visibles[pos1] = verdedero;
 visibles[pos2] = verdedero;
 parejasEncontradas++;
 } mas {
 Sistema apagado.println(„No es una pareja. Intenciación de nuevo.");
 Sistema apagado.imprimirln("\n".repetir(10)); // Ocultar las selecciones con saltos de línea
            }
        }

 // Juego terminado
 Sistema apagado. .imprimirln("¡Felicidades! Ha encontrado todas las pares.");
 Sistema apagado.imprimirln(„Tablero final:");
 parr (int i = 0; yo < tablero.longitud; i++) {
 System.out.printf(„%-10", tablero[i]);
 si ((yo + 1) % 5 == 0) Sistema apagado.imprimirln(); // Salto de línea cada 5 elementos
        }

 sc.cerca();
    }
}
