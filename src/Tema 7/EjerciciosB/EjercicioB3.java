package tema7.ejercicios_B.Documentos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo de lectura: ");
        String archivoLectura = scanner.nextLine();
        System.out.print("Introduce el nombre del archivo de escritura: ");
        String archivoEscritura = scanner.nextLine();
        scanner.close();

        ArrayList<String> lineas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoLectura));
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + archivoLectura);
            return;
        }

        Collections.sort(lineas);

        try {
            PrintWriter pw = new PrintWriter(new FileWriter(archivoEscritura));
            for (String linea : lineas) {
                pw.println(linea);
            }
            pw.close();
            System.out.println("Archivo escrito y ordenado en: " + archivoEscritura);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + archivoEscritura);
        }
    }
}
