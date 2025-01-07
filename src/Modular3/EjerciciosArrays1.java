import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

clase pública EjerciciosArrays1 {

 // a) Procedimiento que imprime el array
 public static void printArray(int[] array) {
 System.out.println(Arrays.toString(array));
    }

 // b) Función que devuelve el máximo del array
 público estático int maxArray(int[] array) {
 int max = matriz[0];
 para (int num: matriz) {
 if (num > max) {
 max = num;
            }
        }
 devuelve máx;
    }

 // c) Función que devuelve el momento del array
 int minArray estático público (int[] array) {
 int min = matriz[0];
 para (int num: matriz) {
 if (num < min) {
 min = num;
            }
        }
 devuelve mín;
    }

 //d) Función que devuelve la media
 público estático doble promedioArray(int[] array) {
 int suma = 0;
 para (int num: matriz) {
 sum += num;
        }
 devuelve (doble) suma / array.length;
    }

 // e) Función que verifica si un elemento existe en el array
 existe booleano estático públicoInArray(int[] array, int element) {
 para (int num: matriz) {
 if (num == elemento) {
 devuelve verdedero;
            }
        }
 devuelve falso;
    }

 // f) Función que suma dos vectores
 int estática pública[] sumArrays(int[] array1, int[] array2) {
 longitud int = Math.min(array1.length, array2.length);
 int[] resultado = nuevo int[longitud];
 para (int i = 0; i < longitud; i++) {
 result[i] = array1[i] + array2[i];
        }
 devuelve resultado;
    }

 // g) Función que resta dos vectores
 int estática pública[] restarArrays(int[] array1, int[] array2) {
 longitud int = Math.min(array1.length, array2.length);
 int[] resultado = nuevo int[longitud];
 para (int i = 0; i < longitud; i++) {
 result[i] = array1[i] - array2[i];
        }
 devuelve resultado;
    }

 // h) Función que realiza el producto escalar de dos vectores
 público estático int dotProduct(int[] array1, int[] array2) {
 longitud int = Math.min(array1.length, array2.length);
 int producto = 0;
 para (int i = 0; i < longitud; i++) {
 producto += array1[i] * array2[i];
        }
 devolver producto;
    }

 // i) Función que existe el orden de un array
 int estático público[] reverseArray(int[] array) {
 int[] invertido = nuevo int[array.length];
 para (int i = 0; i < array.length; i++) {
 reversed[i] = array[array.length - 1 - i];
        }
 return reverse;
    }

 // j) Procedimiento que invierte el orden de un array
 público estático vacío inversoArrayInPlace(int[] array) {
 int temp;
 para (int i = 0; i < array.length / 2; i++) {
 temp = matriz[i];
 array[i] = array[array.length - 1 - i];
 array[array.length - 1 - i] = temp;
        }
    }

 // k) Función que verifica si un array es capicua
 ispalindrome (int[] array) booleano estático público {
 para (int i = 0; i < array.length / 2; i++) {
 si (matriz[i] != array[array.length - 1 - i]) {
 devuelve falso;
            }
        }
 devuelve verdadero;
    }

 // Juego: Atrapa a la mosca
 juego vacío estático públicoCatchTheFly() {
 Scanner scanner = nuevo Scanner(System.in);
 Aleatorio aleatorio = nuevo Aleatorio();

 int[] matriz = nuevo int[15];
 int flyPosition = random.nextInt(15);
 array[flyPosition] = 1; // La mosca está en esta posición

 booleano atrapó = falso;
 mientras (!atrapado) {
 System.out.println("Adivina la posición de la mosca (1-15):");
 int adivina = escáner.nextInt() - 1; // Ajustar un índice del array

 si (adivina < 0 || adivina >= 15) {
 System.out.println("Posición no vida. Intenta de nuevo.");
 continuă;
            }

 if (adivina == flyPosition) {
 System.out.println("¡Tiene atrapado a la mosca! Ganaste.");
 captado = verdedero;
 } else if (Math.abs(guess - flyPosition) == 1) {
 System.out.println("Casi la atrapas. La mosca ha cambiado de posición.");
 array[flyPosition] = 0; // La mosca se mueve
 flyPosition = random.nextInt(15);
 array[flyPosition] = 1;
 } más {
 System.out.println("Fallaste. Intenta de nuevo.");
            }
        }
    }

    // Programa principal con menú
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array:");
 int size = scanner.nextInt();
 int[] array = nuevo int[tamaño];

 System.out.println("Introducir los elementos del array:");
 para (int i = 0; i < tamaño; i++) {
 array[i] = scanner.nextInt();
        }

 salida booleana = falsa;
 mientras (!salir) {
 System.out.println("\nMenú de opciones:");
 System.out.println("1. Matriz Imprimir");
 System.out.println("2. Máximo del array");
 System.out.println("3. Mínimo del array");
 System.out.println("4. Media del array");
 System.out.println("5. Verificar si un elemento existe");
 System.out.println("6. Matriz invertir");
 System.out.println("7. Verificar si el array es capicua");
 System.out.println("8. Jugar Atrapa a la mosca");
 System.out.println("0. Salir");

 opción int = scanner.nextInt();
 cambiar (opción) {
 cazul 1:
 printArray(matriz);
 mameluco;
 cazul 2:
 System.out.println("Máximo: "+ maxArray(array));
 mameluco;
 cazul 3:
 System.out.println("Mínimo: "+ minArray(array));
 mameluco;
 cazul 4:
 System.out.println("Medios: "+ promedioArray(matriz));
 mameluco;
 cazul 5:
 System.out.println("Presentar el elemento a buscar:");
 elemento int = scanner.nextInt();
 System.out.println("Existe: "+ existeInArray(array, elemento));
 mameluco;
 cazul 6:
 reverseArrayInPlace(matriz);
 System.out.println("Array invertido:");
 printArray(matriz);
 mameluco;
 cazul 7:
 System.out.println("Capicúa: "+ isPalindrome(array));
 mameluco;
 cazul 8:
 playCatchTheFly();
 mameluco;
 caz 0:
 sal = verdedero;
 mameluco;
 predeterminat:
 System.out.println("Opción no válida");
            }
        }
 scanner.close();
    }
}
