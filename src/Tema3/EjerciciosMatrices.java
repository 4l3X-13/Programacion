package Tema3;

import java.util.Random;

public class EjerciciosMatrices {
    private final int[][] matrix;

    public EjerciciosMatrices(int rows, int cols) {
        matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Números aleatorios entre 0 y 9
            }
        }
    }

    public void printMatrix() {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public int getMax() {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) max = element;
            }
        }
        return max;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) min = element;
            }
        }
        return min;
    }

    public double getAverage() {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }
        return (double) sum / count;
    }

    public boolean elementExists(int num) {
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == num) return true;
            }
        }
        return false;
    }

    public int countOccurrences(int num) {
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == num) count++;
            }
        }
        return count;
    }

    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return result;
    }

    public boolean isIdentityMatrix() {
        if (matrix.length != matrix[0].length) return false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        EjerciciosMatrices matrix1 = new EjerciciosMatrices(3, 3);
        EjerciciosMatrices matrix2 = new EjerciciosMatrices(3, 3);

        // Mostrar las matrices generadas
        System.out.println("Matriz 1:");
        matrix1.printMatrix();
        System.out.println("Matriz 2:");
        matrix2.printMatrix();

        // Realizar operaciones
        System.out.println("Máximo de la matriz 1: " + matrix1.getMax());
        System.out.println("Mínimo de la matriz 1: " + matrix1.getMin());
        System.out.println("Promedio de la matriz 1: " + matrix1.getAverage());

        int searchElement = 5;
        System.out.println("¿El número " + searchElement + " existe en la matriz 1? " + matrix1.elementExists(searchElement));
        System.out.println("El número " + searchElement + " aparece " + matrix1.countOccurrences(searchElement) + " veces en la matriz 1.");

        // Sumar matrices
        int[][] resultAdd = addMatrices(matrix1.matrix, matrix2.matrix);
        System.out.println("Resultado de la suma de las matrices:");
        for (int[] row : resultAdd) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Verificar si una matriz es identidad
        System.out.println("¿Es la matriz 1 una matriz identidad? " + matrix1.isIdentityMatrix());
    }
}
