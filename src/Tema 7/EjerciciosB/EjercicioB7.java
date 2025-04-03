package tema7.ejercicios_B.Documentos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class EjercicioB7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo a analizar: ");
        String archivo = sc.nextLine();
        sc.close();

        int numLineas = 0;
        int numPalabras = 0;
        int numCaracteres = 0;
        HashMap<String, Integer> frecuencia = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                numLineas++;
                numCaracteres += linea.length();

                String[] palabras = linea.split("\\W+");
                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        numPalabras++;
                        palabra = palabra.toLowerCase();
                        frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + archivo);
            return;
        }

        System.out.println("Número de líneas: " + numLineas);
        System.out.println("Número de palabras: " + numPalabras);
        System.out.println("Número de caracteres: " + numCaracteres);

        System.out.println("Las 10 palabras más comunes:");
        frecuencia.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(10)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
