package Modular3;

import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
        System.out.println("Inserta que quieres calcular: 1. Circulo 2. Cuadrado 3.Rectángulo");
        int seleccion = 0;
        Scanner scanner = new Scanner(System.in);
        seleccion = scanner.nextInt();


        switch(seleccion) {
            case 1:
                System.out.println("Inserta el Radio del circulo: ");
                double radio = scanner.nextDouble();
                double perimetrocirculo = circlePerimeter(radio);
                System.out.println("El Perímetro del circulo es " + perimetrocirculo);
                double areacirculo = circleArea (radio);
                System.out.println("El Area del circulo es " + areacirculo);
                break;

            case 2:
                System.out.println("Inserta la longitud del lado: ");
                double lado = scanner.nextDouble();
                double perimetrocuadrado = squarePerimeter(lado);
                System.out.println("El Perímetro del cuadrado es " + perimetrocuadrado);
                double areacuadrado = squareArea(lado);
                System.out.println("El Area del cuadrado es " + areacuadrado);
                break;

            case 3:
                System.out.println("Inserta la longitud: ");
                double longitud = scanner.nextDouble();
                System.out.println("Inserta el ancho: ");
                double ancho = scanner.nextDouble();
                double perimetrorectangulo = rectanglePerimeter(longitud, ancho);
                System.out.println(" El Perímetro del rectángulo " + perimetrorectangulo);
                double arearectangulo = rectangleArea(longitud , ancho);
                System.out.println("El Area del rectángulo " + arearectangulo);
                break;
        }


    }




    public static double circlePerimeter (double radio){
        return 3.14 * (radio *2);
    }

    public static double circleArea (double radio) {
        return 3.14 * radio * radio;

    }


    public static double squarePerimeter (double lado){
        return lado * 4;
    }

    public static double squareArea (double lado){
        return lado * lado;
    }


    public static double rectanglePerimeter  (double longitud , double ancho){
        return (2 * longitud) + (2 * ancho);
    }

    public static double rectangleArea (double longitud , double ancho){
        return longitud * ancho;
    }



}
