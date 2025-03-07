package Programacion;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Set<String> listaCompra = new HashSet<>();
        Set<String> carroCompra = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Añadir producto");
            System.out.println("2. Añadir al carro");
            System.out.println("3. Ver lista");
            System.out.println("4. Ver carro");
            System.out.println("5. Faltantes");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Producto: ");
                String producto = scanner.nextLine();

                switch (opcion) {
                    case 1:
                        if (!listaCompra.add(producto)) System.out.println("Ya está en la lista.");
                        break;
                    case 2:
                        if (listaCompra.contains(producto)) carroCompra.add(producto);
                        else System.out.println("No está en la lista.");
                        break;
                    case 3:
                        System.out.println("Lista: " + listaCompra);
                        break;
                    case 4:
                        System.out.println("Carro: " + carroCompra);
                        break;
                    case 5:
                        Set<String> faltantes = new HashSet<>(listaCompra);
                        faltantes.removeAll(carroCompra);
                        System.out.println("Faltantes: " + faltantes);
                        break;
                }
            } else if (opcion != 6) {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
