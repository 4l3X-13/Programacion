package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int personas;
        double dias, normal, noches, Descuento;
        int pnoche  = 15;
        System.out.println("Inserta el número de personas que van a estar en el camping: ");
        personas = scan.nextInt();
        System.out.println("Inserta el número de noches que van a estar en el camping: ");
        noches = scan.nextInt();


        if (personas > 5 && noches > 7) {
            normal = (noches * pnoche) * personas;
            Descuento = normal - (normal * 0.25);
            System.out.println("El total es" + normal + "y con el descuento" + Descuento);
        }else{
            normal = (noches * pnoche) * personas;
            System.out.println("El total es " + normal + "€");
        }
    scan.close();
    }

}
