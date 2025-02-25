package Tema5.Colecciones;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> listaCompra = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String producto;

        System.out.print("Introduce un producto ('salir' para terminar): ");
        producto = scanner.nextLine();

        while (!producto.equalsIgnoreCase("salir")) {
            if (listaCompra.contains(producto)) {
                System.out.println("El producto ya está en la lista.");
            } else {
                listaCompra.add(producto);
                System.out.println("Producto agregado.");
            }
            System.out.print("Introduce otro producto ('salir' para terminar): ");
            producto = scanner.nextLine();
        }

        System.out.println("Lista de la compra:");
        for (String item : listaCompra) {
            System.out.println("- " + item);
        }

        scanner.close();
    }
}
