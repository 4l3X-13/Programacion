package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2 = 0;
        boolean entra = true;
        char oper;

        System.out.println("Bienvenido a la calculadora. Introduce 'salir' en cualquier momento para finalizar.");

        System.out.print("Introduce el primer número: ");
        num1 = scan.nextInt();

        System.out.print("Introduce el primer número: ");
        num1 = scan.nextInt();

        System.out.println("Inserta la operación que deseas realizar: (+,-,*,/,% s");
        oper=scan.next().charAt(0);

        switch (oper){
            case 's' -> {
                entra = false;
            }
            case '+' ->{
                int suma;
                suma = num1 + num2;
                System.out.println("La suma es: "+ suma);
            }

            case '-' ->{
                int resta;
                resta = num1 - num2;
                System.out.println("La resta es: "+ resta);
            }

            case'*'->{
                int multiplicar;
                multiplicar = num1 * num2;
                System.out.println("La multiplicación es: "+ multiplicar);
            }
            case'/'->{
                int dividir;
                dividir = num1 / num2;
                System.out.println("La división es: "+ dividir);
            }

            case'%'->{
                int resto;
                resto = num1 % num2;
                System.out.println("El resto es: "+ resto);
            }


        }

    }
}
