import java.util.Scanner;
import java.util.Random;

public class Matrices2 {

    public static void main(String[] args) {
        int[][] tablero = new int[4][4];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Colocar la mosca en una posición aleatoria
        int moscaX = random.nextInt(4);
        int moscaY = random.nextInt(4);

        boolean atrapada = false;

        System.out.println("¡Bienvenido a Atrapa la Mosca!");
        System.out.println("El tablero tiene dimensiones 4x4. Encuentra la mosca.");

        while (!atrapada) {
            // Mostrar tablero
            mostrarTablero(tablero);

            // Pedir coordenadas al usuario
            System.out.print("Introduce la fila (1-4): ");
            int fila = scanner.nextInt() - 1;
            System.out.print("Introduce la columna (1-4): ");
            int columna = scanner.nextInt() - 1;

            // Validar entrada
            if (fila < 0 || fila >= 4 || columna < 0 || columna >= 4) {
                System.out.println("Coordenadas fuera del tablero. Intenta de nuevo.");
                continue;
            }

            // Verificar si el usuario ha atrapado a la mosca
            if (fila == moscaX && columna == moscaY) {
                atrapada = true;
                System.out.println("¡Has atrapado a la mosca!");
            } else if (esAdyacente(fila, columna, moscaX, moscaY)) {
                // Mover la mosca aleatoriamente si está adyacente
                System.out.println("¡La mosca estaba cerca! Se mueve a una nueva posición.");
                moscaX = random.nextInt(4);
                moscaY = random.nextInt(4);
            } else {
                System.out.println("La mosca no está cerca. Intenta de nuevo.");
            }
        }

        scanner.close();
    }

    // Función para mostrar el tablero
    public static void mostrarTablero(int[][] tablero) {
        for (int[] fila : tablero) {
            for (int celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }

    // Función para verificar si una posición es adyacente a otra
    public static boolean esAdyacente(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1;
    }
}
