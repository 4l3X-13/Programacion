package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lado;
        double superficie;
        double perimetro;
    System.out.println("Inserta el lado del cuadrado");
        lado = scan.nextInt();
        superficie = lado * lado;
    System.out.println("La superficie del cuadrado es: " + superficie);
        perimetro = lado * 4;
        System.out.print("El perímetro del cuadrado es: " + perimetro);

        scan.close();



    }
}