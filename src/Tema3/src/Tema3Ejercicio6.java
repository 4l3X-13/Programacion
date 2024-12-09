package Tema3.src;

import java.util.Scanner;

public class Tema3Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce que tabla de multiplicar quieres: (1-10)");
        int numero = scanner.nextInt();
        int tablaMultiplicar1 = multiplicar1(numero);
        int tablaMultiplicar2 = multiplicar2(numero);
        int tablaMultiplicar3 = multiplicar3(numero);
        int tablaMultiplicar4 = multiplicar4(numero);
        int tablaMultiplicar5 = multiplicar5(numero);
        int tablaMultiplicar6 = multiplicar6(numero);
        int tablaMultiplicar7 = multiplicar7(numero);
        int tablaMultiplicar8 = multiplicar8(numero);
        int tablaMultiplicar9 = multiplicar9(numero);
        int tablaMultiplicar10 = multiplicar10(numero);






        System.out.println();
        System.out.println(tablaMultiplicar1);
        System.out.println(tablaMultiplicar2);
        System.out.println(tablaMultiplicar3);
        System.out.println(tablaMultiplicar4);
        System.out.println(tablaMultiplicar5);
        System.out.println(tablaMultiplicar6);
        System.out.println(tablaMultiplicar7);
        System.out.println(tablaMultiplicar8);
        System.out.println(tablaMultiplicar9);
        System.out.println(tablaMultiplicar10);




    }



   public static int multiplicar1(int numero) {
        return numero * 1;
    }

    public static int multiplicar2 (int numero){
        return numero * 2;
    }

    public static int multiplicar3 (int numero){
        return numero * 3;
    }

    public static int multiplicar4 (int numero){
        return numero * 4;
    }

    public static int multiplicar5 (int numero){
        return numero * 5;
    }

    public static int multiplicar6 (int numero){
        return numero * 6;
    }

    public static int multiplicar7 (int numero){
        return numero * 7;
    }

    public static int multiplicar8 (int numero){
        return numero * 8;
    }
    public static int multiplicar9 (int numero){
        return numero * 9;
    }

    public static int multiplicar10 (int numero){
        return numero * 10;
    }
}
