package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args) {
        double base;
        double altura;
        double superficie;
        double perímetro;
    Scanner scan = new Scanner(System.in);
        System.out.println("Inserta la base:");
        base = scan.nextInt();
        System.out.println("Inserta la altura");
        altura = scan.nextInt();
        superficie = base * altura;
        System.out.println("La superficie es: "+ superficie);
        perímetro = (base * 2) + (altura * 2);
        System.out.println("El perímetro es: " + perímetro);
        scan.close();
    }
}