package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Introduce una cara del dado (de 1 a 6): ");
                int cara = in.nextInt();

                if (cara < 1 || cara > 6) {
                    System.out.println("No es un número correcto.");
                } else {
                    int caraOpuesta = 7 - cara;
                    System.out.println("La cara opuesta es: " + caraOpuesta);
                }

            }
        }



