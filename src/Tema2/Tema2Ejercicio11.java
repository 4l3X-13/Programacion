package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio11 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n1,n2,n3;
            System.out.println("Inserta 3 números : ");
            n1 = scan.nextInt();
            n2 = scan.nextInt();
            n3 = scan.nextInt();
            if (n2 == n1 +- 1 && n3 == n2 +- 1){
                System.out.println("Son consecutivos.");
            }else {
                System.out.println("No son consecutivos.");
            }
            scan.close();
        }
    }

