package Tema3Modular1.src;

import java.util.Scanner;

public class Tema3Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta el día: ");
        int diaUsu = scanner.nextInt();



        System.out.println("Inserta el mes: ");
        int mesUsu = scanner.nextInt();



        System.out.println("Inserta el año: ");
        int anyoUsu = scanner.nextInt();




        scanner.close();
    }

    public static int validarFecha (int diaUsu , int mesUsu , int anyoUsu ){
        switch (mesUsu){
            case 1 ,3 ,5 ,7 ,8 , 10 ,12:
                if (diaUsu > 31 && diaUsu < 0){
                    System.out.println("El día no es válido");
                }else{
                    System.out.println("El día es válido");
                }
            case 2:
                if (diaUsu > 29 && diaUsu < 0){
                    System.out.println("El día no es váldo");
                }else{
                    System.out.println("El día es válido");
                }
            case 4 ,6,9 ,11:
                if (diaUsu >30 && diaUsu < 0){
                    System.out.println("El día no es válido");
                }else{
                    System.out.println("El día es válido");
                }


        }
    return mesUsu;
    }




}



