package Tema3.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosArrays3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Inicializar las variables
        Random random = new Random();
        int posicionMosca = random.nextInt(16);
        System.out.println("JUEGO ATRAPA A LA MOSCA:");
        int selecUsu;

        //Bucle que te dice si has acertado o no
        do {
            System.out.println("Indica donde está la mosca: ");
            selecUsu = scanner.nextInt();
            if (selecUsu == posicionMosca) {

                System.out.println("¡Has acertado!");
            }else{
                System.out.println("¡No has acertado!");
            }

        }while(selecUsu != posicionMosca);


    }

}