package Programacion.POO3;

abstract class Figura2D {
    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "Área: " + area() + ", Perímetro: " + perimetro();
    }
}

class Cuadrado extends Figura2D {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }
}

class Rectangulo extends Figura2D {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return largo * ancho;
    }

    @Override
    public double perimetro() {
        return 2 * (largo + ancho);
    }
}

class Triangulo extends Figura2D {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return base + altura + Math.sqrt(base * base + altura * altura); // Aproximación
    }
}

class Circulo extends Figura2D {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Figura2D cuadrado = new Cuadrado(4);
        Figura2D rectangulo = new Rectangulo(5, 3);
        Figura2D triangulo = new Triangulo(6, 4);
        Figura2D circulo = new Circulo(3);

        System.out.println("Cuadrado: " + cuadrado);
        System.out.println("Rectángulo: " + rectangulo);
        System.out.println("Triángulo: " + triangulo);
        System.out.println("Círculo: " + circulo);
    }
}
