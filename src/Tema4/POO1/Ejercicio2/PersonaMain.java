import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los datos de la primera persona:");
        System.out.print("DNI: ");
        String dni1 = scanner.nextLine();
        while (!Persona.checkDNI(dni1)) {
            System.out.print("DNI inválido, intenta de nuevo: ");
            dni1 = scanner.nextLine();
        }
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos1 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine();

        Persona persona1 = new Persona(dni1, nombre1, apellidos1, edad1);

        System.out.println("Introduce los datos de la segunda persona:");
        System.out.print("DNI: ");
        String dni2 = scanner.nextLine();
        while (!Persona.checkDNI(dni2)) {
            System.out.print("DNI inválido, intenta de nuevo: ");
            dni2 = scanner.nextLine();
        }
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos2 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine();

        Persona persona2 = new Persona(dni2, nombre2, apellidos2, edad2);

        System.out.println("\nInformación de la primera persona:");
        persona1.print();
        System.out.println("¿Es mayor de edad?: " + persona1.isAdult());
        System.out.println("¿Está jubilado?: " + persona1.isRetired());

        System.out.println("\nInformación de la segunda persona:");
        persona2.print();
        System.out.println("¿Es mayor de edad?: " + persona2.isAdult());
        System.out.println("¿Está jubilado?: " + persona2.isRetired());

        System.out.println("\nDiferencia de edad entre las dos personas: " + persona1.ageDifference(persona2) + " años");

        scanner.close();
    }
}
