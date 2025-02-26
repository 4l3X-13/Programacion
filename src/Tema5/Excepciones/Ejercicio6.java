package Programacion.Excepciones;

class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("El nombre debe tener al menos 3 caracteres.");
        }
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Gato: " + nombre + ", Edad: " + edad + " años.");
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("El nombre debe tener al menos 3 caracteres.");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            Gato gato1 = new Gato("Felix", 3);
            gato1.imprimir();

            Gato gato2 = new Gato("Tom", -1); 
            gato2.imprimir();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Gato gato3 = new Gato("Luna", 2);
            gato3.imprimir();
            gato3.setNombre("Li"); 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
