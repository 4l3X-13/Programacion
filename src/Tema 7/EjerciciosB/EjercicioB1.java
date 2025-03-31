package tema7.ejercicios_B.Documentos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioB1 {
    public static void main(String[] args) {
        String archivo = "numeros.txt";
        try {
            Scanner scanner = new Scanner(new File(archivo));
            if (!scanner.hasNextDouble()) {
                System.out.println("El archivo no contiene números.");
                scanner.close();
                return;
            }
            double numero = scanner.nextDouble();
            double minimo = numero;
            double maximo = numero;

            while (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                if (numero < minimo) {
                    minimo = numero;
                }
                if (numero > maximo) {
                    maximo = numero;
                }
            }
            scanner.close();
            System.out.println("Valor mínimo: " + minimo);
            System.out.println("Valor máximo: " + maximo);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo: " + archivo);
        }
    }
}
