package tema7.ejercicios_B.Documentos;

import java.io.*;
import java.util.*;

public class EjercicioB5 {
    public static void main(String[] args) {
        String carpeta = "Diccionario";
        File directorio = new File(carpeta);

        if (!directorio.exists() && !directorio.mkdir()) {
            System.out.println("No se pudo crear la carpeta.");
            return;
        }

        List<List<String>> listas = new ArrayList<>(Collections.nCopies(26, new ArrayList<>()));

        try (BufferedReader br = new BufferedReader(new FileReader("diccionario.txt"))) {
            String palabra;
            while ((palabra = br.readLine()) != null) {
                palabra = palabra.trim();
                if (!palabra.isEmpty()) {
                    char primeraLetra = Character.toUpperCase(palabra.charAt(0));
                    if (primeraLetra >= 'A' && primeraLetra <= 'Z') {
                        listas.get(primeraLetra - 'A').add(palabra);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo diccionario.txt");
            return;
        }

        for (int i = 0; i < 26; i++) {
            char letra = (char) ('A' + i);
            String nombreArchivo = carpeta + "/" + letra + ".txt";
            try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo))) {
                for (String palabra : listas.get(i)) {
                    pw.println(palabra);
                }
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + nombreArchivo);
            }
        }

        System.out.println("Archivos creados en la carpeta 'Diccionario'.");
    }
}
