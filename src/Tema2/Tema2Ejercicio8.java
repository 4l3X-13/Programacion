package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double euro, dolar;
        System.out.println("Inserta cuantos € tienes : ");
        euro = scan.nextInt();
        dolar = euro * 1.08;
        System.out.print("Tienes "+ dolar +" $.");
        scan.close();

    }
}
