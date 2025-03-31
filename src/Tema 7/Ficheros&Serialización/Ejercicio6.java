package tema7.FicherosYserialización;

import java.io.*;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número a buscar en PI: ");
        String numero = scanner.nextLine();
        scanner.close();

        String archivoPI = "pi-million.txt";

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoPI));
            StringBuilder pi = new StringBuilder();
            String linea;

            while ((linea = lector.readLine()) != null) {
                pi.append(linea.trim());
            }

            lector.close();

            int posicion = buscarEnPi(pi.toString(), numero);

            if (posicion == -1) {
                System.out.println("El número " + numero + " no se encuentra en el primer millón de decimales de PI.");
            } else {
                System.out.println("El número " + numero + " se encuentra en la posición " + posicion + " de los decimales de PI.");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }

    public static int buscarEnPi(String pi, String numero) {
        int m = numero.length();
        int n = pi.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (pi.charAt(i + j) != numero.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
