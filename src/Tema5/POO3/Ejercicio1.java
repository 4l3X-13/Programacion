package Programacion.POO3;
class Turismo {
    String marca;
    String modelo;
    int numeroPlazas;

    public Turismo(String marca, String modelo, int numeroPlazas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPlazas = numeroPlazas;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Número de plazas: " + numeroPlazas);
    }
}

class Camion {
    String marca;
    String modelo;
    double pesoMaximo;

    public Camion(String marca, String modelo, double pesoMaximo) {
        this.marca = marca;
        this.modelo = modelo;
        this.pesoMaximo = pesoMaximo;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Peso máximo: " + pesoMaximo + " kg");
    }
}

class Ciclomotor {
    String marca;
    String modelo;
    int cilindrada;

    public Ciclomotor(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Cilindrada: " + cilindrada + " cc");
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Turismo turismo = new Turismo("Toyota", "Corolla", 5);
        Camion camion = new Camion("Volvo", "FH16", 20000);
        Ciclomotor ciclomotor = new Ciclomotor("Yamaha", "Jog", 125);

        turismo.mostrarInfo();
        camion.mostrarInfo();
        ciclomotor.mostrarInfo();
    }
}
