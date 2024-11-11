package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
                int contador = 0;
                int numero;

                System.out.println("Introduce números enteros positivos (introduce un número negativo para terminar):");
                numero = scan.nextInt();

                while (numero >= 0) {
                    suma += numero;
                    contador++;
                    numero = scan.nextInt();
                }

                if (contador > 0) {
                    double media = (double) suma / contador;
                    System.out.println("La media de los números introducidos es: " + media);
                } else {
                    System.out.println("No se han introducido números positivos.");
                }

                scan.close();
            }
        }

