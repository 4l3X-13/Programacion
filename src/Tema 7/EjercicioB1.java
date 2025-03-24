package tema7.ejercicios_B.Documentos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioB1 {
    public static void main(String[] args) {
        String nombreArchivo = "numeros.txt";
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            while ((linea = lector.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linea.trim());
                    if (numero > maximo) {
                        maximo = numero;
                    }
                    if (numero < minimo) {
                        minimo = numero;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Línea no válida: " + linea);
                }
            }

            lector.close();

            System.out.println("Número máximo: " + maximo);
            System.out.println("Número mínimo: " + minimo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
