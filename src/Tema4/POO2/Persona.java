package Tema4.POO2;

public class Persona {
    private String dni;
    private Cuenta[] cuentas = new Cuenta[3]; // Array para almacenar hasta 3 cuentas
    private int numeroCuentas = 0;

    public Persona(String dni) {
        this.dni = dni;
    }

    public void añadirCuenta(Cuenta cuenta) {
        if (numeroCuentas < 3) {
            cuentas[numeroCuentas] = cuenta;
            numeroCuentas++;
        } else {
            System.out.println("No se pueden añadir más de 3 cuentas.");
        }
    }

    public boolean esMorosa() {
        for (int i = 0; i < numeroCuentas; i++) {
            if (cuentas[i].getSaldoDisponible() < 0) {
                return true;
            }
        }
        return false;
    }

    public String getDni() {
        return dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }
}
