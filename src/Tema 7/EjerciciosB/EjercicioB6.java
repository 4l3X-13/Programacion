package tema7.ejercicios_B.Documentos;

import java.io.*;
import java.util.*;

public class EjercicioB6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número a buscar en pi: ");
        String numeroBuscado = scanner.nextLine().trim();
        scanner.close();

        StringBuilder piDecimales = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("pi-million.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                piDecimales.append(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo pi-million.txt");
            return;
        }

        if (piDecimales.indexOf(numeroBuscado) != -1) {
            System.out.println("El número " + numeroBuscado + " aparece en los primeros decimales de pi.");
        } else {
            System.out.println("El número " + numeroBuscado + " NO aparece en los primeros decimales de pi.");
        }
    }
}
