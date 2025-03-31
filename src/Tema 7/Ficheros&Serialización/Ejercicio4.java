package tema7.FicherosYserialización;

import java.io.*;
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos nombres deseas generar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Nombre del archivo de salida: ");
        String archivoSalida = scanner.nextLine();

        List<String> nombres = leerArchivo("usa_nombres.txt");
        List<String> apellidos = leerArchivo("usa_apellidos.txt");

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida, true));
            Random random = new Random();

            for (int i = 0; i < cantidad; i++) {
                String nombre = nombres.get(random.nextInt(nombres.size()));
                String apellido = apellidos.get(random.nextInt(apellidos.size()));
                escritor.write(nombre + " " + apellido);
                escritor.newLine();
            }

            escritor.close();
            System.out.println("Se generaron " + cantidad + " nombres en el archivo " + archivoSalida);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }

        scanner.close();
    }

    private static List<String> leerArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();
        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = lector.readLine()) != null) {
                lineas.add(linea.trim());
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + nombreArchivo);
        }
        return lineas;
    }
}
