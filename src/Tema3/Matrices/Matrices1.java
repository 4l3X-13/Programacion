import java.util.Random;
import java.util.Scanner;

public class Matrices1 {

    // a) Procedimiento para imprimir la matriz
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // b) Función para devolver el máximo de la matriz
    public static int getMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    // c) Función para devolver el mínimo de la matriz
    public static int getMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    // d) Función para devolver la media de la matriz
    public static double getAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }

    // e) Función para verificar si un elemento existe en la matriz
    public static boolean contains(int[][] matrix, int element) {
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == element) {
                    return true;
                }
            }
        }
        return false;
    }

    // f) Función para contar cuántas veces se repite un número en la matriz
    public static int countOccurrences(int[][] matrix, int element) {
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == element) {
                    count++;
                }
            }
        }
        return count;
    }

    // g) Función para sumar dos matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // h) Función para restar dos matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // i) Función para verificar si una matriz es la matriz identidad
    public static boolean isIdentityMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) return false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j && matrix[i][j] != 1) return false;
                if (i != j && matrix[i][j] != 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Ejemplo de uso de las funciones
        int[][] matrix = new int[4][4];

        // Inicializar matriz con valores aleatorios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(10); // Valores entre 0 y 9
            }
        }

        System.out.println("Matriz generada:");
        printMatrix(matrix);

        System.out.println("Máximo: " + getMax(matrix));
        System.out.println("Mínimo: " + getMin(matrix));
        System.out.println("Media: " + getAverage(matrix));
        System.out.print("Introduce un número para buscar en la matriz: ");
        int num = sc.nextInt();
        System.out.println("¿Existe en la matriz? " + contains(matrix, num));
        System.out.println("Número de ocurrencias: " + countOccurrences(matrix, num));
    }
}
