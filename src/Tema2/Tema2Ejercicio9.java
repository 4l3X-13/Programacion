package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double dolar, euro;
            System.out.println("Inserta cuantos $ tienes : ");
            dolar = scan.nextDouble();
            euro = dolar / 1.08;
            System.out.print("Tienes "+ euro +" €.");
            scan.close();

        }
    }

