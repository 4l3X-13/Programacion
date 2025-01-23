package Tema3.Modular3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class EjerciciosArrays1 {

    // a) Procedimiento que imprime el array
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // b) Función que devuelve el máximo del array
    public static int maxArray(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // c) Función que devuelve el mínimo del array
    public static int minArray(int[] array) {
        int min = array[0]; //No se valida que el array no esté vacío.
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // d) Función que devuelve la media
    public static double averageArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // e) Función que verifica si un elemento existe en el array
    public static boolean existsInArray(int[] array, int element) {
        for (int num : array) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }

    // f) Función que suma dos vectores
    public static int[] sumArrays(int[] array1, int[] array2) {
        int length = Math.min(array1.length, array2.length);
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }

    // g) Función que resta dos vectores
    public static int[] subtractArrays(int[] array1, int[] array2) {
        int length = Math.min(array1.length, array2.length);
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }

    // h) Función que realiza el producto escalar de dos vectores
    public static int dotProduct(int[] array1, int[] array2) {
        int length = Math.min(array1.length, array2.length);
        int product = 0;
        for (int i = 0; i < length; i++) {
            product += array1[i] * array2[i];
        }
        return product;
    }

    // i) Función que invierte el orden de un array
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // j) Procedimiento que invierte el orden de un array
    public static void reverseArrayInPlace(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        array = reverseArray(array); //Innecesario, y no afecta al array original.
    }

    // k) Función que verifica si un array es capicúa
    public static boolean isCapicua(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }







    // Programa principal con menú
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Imprimir array");
            System.out.println("2. Máximo del array");
            System.out.println("3. Mínimo del array");
            System.out.println("4. Media del array");
            System.out.println("5. Verificar si un elemento existe");
            System.out.println("6. Invertir array");
            System.out.println("7. Verificar si el array es capicúa");
            System.out.println("0. Salir");

            String option = scanner.nextLine(); // Error: debería usar nextInt.
            switch (option) {
                case "1":
                    printArray(array);
                    break;
                case "2":
                    System.out.println("Máximo: " + maxArray(array));
                    break;
                case "3":
                    System.out.println("Mínimo: " + minArray(array));
                    break;
                case "4":
                    System.out.println("Media: " + averageArray(array));
                    break;
                case "5":
                    System.out.println("Introduce el elemento a buscar:");
                    int element = scanner.nextInt();
                    System.out.println("Existe: " + existsInArray(array, element));
                    break;
                case "6":
                    reverseArrayInPlace(array);
                    System.out.println("Array invertido:");
                    printArray(array);
                    break;
                case "7":
                    System.out.println("Capicúa: " + isCapicua(array));
                    break;
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        scanner.close();
    }
}
