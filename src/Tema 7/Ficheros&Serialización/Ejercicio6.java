package tema7.FicherosYserialización;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Alex", 19);
        Persona p2 = new Persona("Pau", 20);
        Persona p3 = new Persona("Ana", 20);

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);

        String ruta = "src/tema7/FicherosYserialización/personas.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(listaPersonas);
            System.out.println("Se serializó correctamente.");
        } catch (IOException e) {
            System.err.println("Error al serializar la lista:");
            e.printStackTrace();
        }
    }
}
