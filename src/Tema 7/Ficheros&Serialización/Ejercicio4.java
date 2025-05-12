package tema7.FicherosYserialización;

import java.io.*;

public class Persona implements Serializable {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Alex", 20);
        String ruta = "src/tema7/FicherosYserialización/persona.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(persona);
            System.out.println("Objeto persona guardado en persona.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            Persona personaLeida = (Persona) ois.readObject();
            System.out.println("Objeto leído: " + personaLeida);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
