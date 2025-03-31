package tema7.ejercicios_B.Documentos;

import java.io.*;
import java.util.*;

public class EjercicioB4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos nombres deseas generar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Introduce el nombre del archivo de salida: ");
        String archivoSalida = scanner.nextLine();

        List<String> nombres = leerLineas("usa_nombres.txt");
        List<String> apellidos = leerLineas("usa_apellidos.txt");

        if (nombres.isEmpty() || apellidos.isEmpty()) {
            System.out.println("Error: No se pudieron cargar los nombres o apellidos.");
            return;
        }

        generarNombres(nombres, apellidos, archivoSalida, cantidad);

        System.out.println("Nombres generados y guardados en " + archivoSalida);
    }

    private static List<String> leerLineas(String archivo) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    lineas.add(linea.trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + archivo);
        }
        return lineas;
    }

    private static void generarNombres(List<String> nombres, List<String> apellidos, String archivoSalida, int cantidad) {
        Random random = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivoSalida, true))) {
            for (int i = 0; i < cantidad; i++) {
                String nombreCompleto = nombres.get(random.nextInt(nombres.size())) + " " + apellidos.get(random.nextInt(apellidos.size()));
                System.out.println(nombreCompleto);
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + archivoSalida);
        }
    }
}
