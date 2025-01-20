import java.util.Scanner;

public class Matrices3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear la matriz para el hotel (12 plantas x 5 habitaciones)
        int[][] hotel = new int[12][5];

        // Pedir al usuario las coordenadas y potencia del router
        System.out.print("Introduce la planta del router (1-12): ");
        int planta = scanner.nextInt() - 1;
        System.out.print("Introduce la habitación del router (1-5): ");
        int habitacion = scanner.nextInt() - 1;
        System.out.print("Introduce la potencia del router: ");
        int potencia = scanner.nextInt();

        // Validar las coordenadas y la potencia
        if (planta < 0 || planta >= 12 || habitacion < 0 || habitacion >= 5 || potencia <= 0) {
            System.out.println("Coordenadas o potencia no válidas.");
        } else {
            // Aplicar la cobertura al hotel
            aplicarCobertura(hotel, planta, habitacion, potencia);

            // Mostrar la matriz resultante
            mostrarMatriz(hotel);
        }

        scanner.close();
    }

    // Método para aplicar la cobertura del router
    public static void aplicarCobertura(int[][] hotel, int planta, int habitacion, int potencia) {
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                // Calcular la distancia entre el router y la habitación actual
                int distancia = Math.abs(i - planta) + Math.abs(j - habitacion);
                // Asignar cobertura si está dentro del rango de la potencia
                if (distancia <= potencia) {
                    hotel[i][j] = Math.max(hotel[i][j], potencia - distancia);
                }
            }
        }
    }

    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }
}
