package Tema2;

public class Tema2Ejercicio21 {
    public static void main(String[] args) {
    int min, max,suma;
        System.out.println("Inserta 2 números enteros: ");
        min = 1;
        max = 1000;
        suma = 0;

        for (int i = min; i <= max; i++) {
            if (i % 2 ==0) {
                suma+=i;
            }
        }
        System.out.println("La suma de todos los números pares entre "+ min+" y "+ max+" es; "+ suma);

    }
}
