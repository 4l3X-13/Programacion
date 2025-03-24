package tema7.ejercicios_B.Documentos;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EjercicioB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del archivo de lectura: ");
        String archivoLectura = scanner.nextLine();

        System.out.print("Introduce el nombre del archivo de escritura: ");
        String archivoEscritura = scanner.nextLine();

        List<String> lineas = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoLectura));
            String linea;

            while ((linea = lector.readLine()) != null) {
                lineas.add(linea);
            }

            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

        Collections.sort(lineas);

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoEscritura));

            for (String linea : lineas) {
                escritor.write(linea);
                escritor.newLine();
            }

            escritor.close();
            System.out.println("Archivo ordenado y guardado en: " + archivoEscritura);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }

        scanner.close();
    }
}
