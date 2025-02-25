package Tema4.POO2;

public class Cuenta {
    private String numeroCuenta;
    private double saldoDisponible;

    public Cuenta(String numeroCuenta, double saldoDisponible) {
        this.numeroCuenta = numeroCuenta;
        this.saldoDisponible = saldoDisponible;
    }

    public double consultarSaldo() {
        return saldoDisponible;
    }

    public void abonar(double cantidad) {
        if (cantidad > 0) {
            saldoDisponible += cantidad;
        }
    }

    public void pagarRecibo(double cantidad) {
        if (cantidad > 0 && saldoDisponible >= cantidad) {
            saldoDisponible -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para realizar el pago.");
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }
}
