package Tema4.POO2;

import java.util.Scanner;

public class PruebaCuentas {
    private static Persona[] personas = new Persona[10];
    private static int numeroPersonas = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Instanciar persona");
            System.out.println("2. Instanciar cuenta y asociarla a una persona");
            System.out.println("3. Mostrar datos de una persona");
            System.out.println("4. Recibir nómina mensual");
            System.out.println("5. Recibir pago");
            System.out.println("6. Realizar transferencia entre cuentas");
            System.out.println("7. Imprimir personas morosas");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    instanciarPersona(sc);
                    break;
                case 2:
                    asociarCuenta(sc);
                    break;
                case 3:
                    mostrarDatosPersona(sc);
                    break;
                case 4:
                    recibirNomina(sc);
                    break;
                case 5:
                    recibirPago(sc);
                    break;
                case 6:
                    realizarTransferencia(sc);
                    break;
                case 7:
                    imprimirPersonasMorosas();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opción no es valida");
            }
        } while (opcion != 8);
    }

    private static void instanciarPersona(Scanner sc) {
        System.out.print("Introduce el DNI de la persona: ");
        String dni = sc.nextLine();
        if (numeroPersonas < 10) {
            personas[numeroPersonas] = new Persona(dni);
            numeroPersonas++;
            System.out.println("Persona creada correctamente.");
        } else {
            System.out.println("Se ha alcanzado el máximo de personas.");
        }
    }

    private static void asociarCuenta(Scanner sc) {
        System.out.print("Introduce el DNI de la persona: ");
        String dni = sc.nextLine();
        Persona persona = buscarPersona(dni);
        if (persona != null) {
            System.out.print("Introduce el número de cuenta: ");
            String numeroCuenta = sc.nextLine();
            System.out.print("Introduce el saldo inicial: ");
            double saldo = sc.nextDouble();
            Cuenta cuenta = new Cuenta(numeroCuenta, saldo);
            persona.añadirCuenta(cuenta);
            System.out.println("Cuenta añadida correctamente.");
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void mostrarDatosPersona(Scanner sc) {
        System.out.print("Introduce el DNI de la persona: ");
        String dni = sc.nextLine();
        Persona persona = buscarPersona(dni);
        if (persona != null) {
            System.out.println("DNI: " + persona.getDni());
            for (Cuenta cuenta : persona.getCuentas()) {
                if (cuenta != null) {
                    System.out.println("Cuenta: " + cuenta.getNumeroCuenta() + " - Saldo: " + cuenta.getSaldoDisponible());
                }
            }
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void recibirNomina(Scanner sc) {
        System.out.print("Introduce el DNI de la persona: ");
        String dni = sc.nextLine();
        Persona persona = buscarPersona(dni);
        if (persona != null) {
            System.out.print("Introduce el número de cuenta: ");
            String numeroCuenta = sc.nextLine();
            System.out.print("Introduce el importe de la nómina: ");
            double cantidad = sc.nextDouble();
            for (Cuenta cuenta : persona.getCuentas()) {
                if (cuenta != null && cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                    cuenta.abonar(cantidad);
                    System.out.println("Nómina abonada correctamente.");
                    return;
                }
            }
            System.out.println("Cuenta no encontrada.");
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void recibirPago(Scanner sc) {
        System.out.print("Introduce el DNI de la persona: ");
        String dni = sc.nextLine();
        Persona persona = buscarPersona(dni);
        if (persona != null) {
            System.out.print("Introduce el número de cuenta: ");
            String numeroCuenta = sc.nextLine();
            System.out.print("Introduce el importe del pago: ");
            double cantidad = sc.nextDouble();
            for (Cuenta cuenta : persona.getCuentas()) {
                if (cuenta != null && cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                    cuenta.abonar(cantidad);
                    System.out.println("Pago recibido correctamente.");
                    return;
                }
            }
            System.out.println("Cuenta no encontrada.");
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void realizarTransferencia(Scanner sc) {
        System.out.print("Introduce el DNI de la persona que realiza la transferencia: ");
        String dni = sc.nextLine();
        Persona persona = buscarPersona(dni);
        if (persona != null) {
            System.out.print("Introduce el número de cuenta origen: ");
            String cuentaOrigen = sc.nextLine();
            System.out.print("Introduce el número de cuenta destino: ");
            String cuentaDestino = sc.nextLine();
            System.out.print("Introduce el importe de la transferencia: ");
            double cantidad = sc.nextDouble();
            Cuenta cuenta1 = null, cuenta2 = null;
            for (Cuenta cuenta : persona.getCuentas()) {
                if (cuenta != null && cuenta.getNumeroCuenta().equals(cuentaOrigen)) {
                    cuenta1 = cuenta;
                }
                if (cuenta != null && cuenta.getNumeroCuenta().equals(cuentaDestino)) {
                    cuenta2 = cuenta;
                }
            }
            if (cuenta1 != null && cuenta2 != null && cuenta1.getSaldoDisponible() >= cantidad) {
                cuenta1.pagarRecibo(cantidad);
                cuenta2.abonar(cantidad);
                System.out.println("Transferencia realizada correctamente.");
            } else {
                System.out.println("Transferencia no realizada. Verifique cuentas y saldo.");
            }
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void imprimirPersonasMorosas() {
        System.out.println("Personas morosas:");
        for (Persona persona : personas) {
            if (persona != null && persona.esMorosa()) {
                System.out.println("DNI: " + persona.getDni());
            }
        }
    }

    private static Persona buscarPersona(String dni) {
        for (Persona persona : personas) {
            if (persona != null && persona.getDni().equals(dni)) {
                return persona;
            }
        }
        return null;
    }
}
