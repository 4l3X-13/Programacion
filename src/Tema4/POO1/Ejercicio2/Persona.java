import java.util.Scanner;

class Persona {
    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    public static final int adultAge = 18;
    public static final int retiredAge = 65;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void print() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }

    public boolean isAdult() {
        return edad >= adultAge;
    }

    public boolean isRetired() {
        return edad > retiredAge;
    }

    public int ageDifference(Persona otraPersona) {
        return Math.abs(this.edad - otraPersona.getEdad());
    }

    public static boolean checkDNI(String dni) {
        return dni.matches("\\d{8}[A-HJ-NP-TV-Z]");
    }
}
