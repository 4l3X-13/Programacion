package tema7.ejercicios_B.Documentos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Alumno {
    String nombre;
    double notaMedia;

    public Alumno(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }
}

public class EjercicioB2 {
    public static void main(String[] args) {
        String nombreArchivo = "alumnos_notas.txt";
        List<Alumno> listaAlumnos = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(":");
                if (partes.length == 2) {
                    String nombre = partes[0].trim();
                    String[] notasTexto = partes[1].trim().split(",");

                    double suma = 0;
                    for (String nota : notasTexto) {
                        suma += Double.parseDouble(nota.trim());
                    }

                    double notaMedia = suma / notasTexto.length;
                    listaAlumnos.add(new Alumno(nombre, notaMedia));
                }
            }

            lector.close();

            listaAlumnos.sort((a1, a2) -> Double.compare(a2.notaMedia, a1.notaMedia));

            for (Alumno alumno : listaAlumnos) {
                System.out.println(alumno.nombre + " - Nota Media: " + alumno.notaMedia);
            }
        } catch (IOException e) {
            System.out.println("Hubo un error al leer el archivo.");
        }
    }
}
