package Tema3Modular1.src;

import java.util.Scanner;

public class Tema3Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número del radio (>0)");
        double radio = scanner.nextDouble();




    }






    public static boolean validRadius(double radius) {
        if (radius < 0) {
            System.out.printf("Su radio no es valido");
            return true;
        }else {
            return false;
        }
    }


    public static double calculateCirclePerimeter(double radius) {

        double perimetro = (radius * 2) * 3.14;
        return perimetro;

    }

    public static double calculateCircleArea(double radius) {
      double area = (radius * radius) * 3.14;
      return area;
    }




}
