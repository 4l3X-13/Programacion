package Programacion.POO3;

class Ficha {
    int numero;
    String titulo;

    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public void imprimirInfo() {
        System.out.println("Título: " + titulo + ", Número: " + numero);
    }
}

class Libro extends Ficha {
    String autor;
    String editorial;

    public Libro(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
    }
}

class Revista extends Ficha {
    int numeroPublicacion;
    int año;

    public Revista(int numero, String titulo, int numeroPublicacion, int año) {
        super(numero, titulo);
        this.numeroPublicacion = numeroPublicacion;
        this.año = año;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Número de publicación: " + numeroPublicacion);
        System.out.println("Año: " + año);
    }
}

class DVD extends Ficha {
    String director;
    int año;
    String tipo;

    public DVD(int numero, String titulo, String director, int año, String tipo) {
        super(numero, titulo);
        this.director = director;
        this.año = año;
        this.tipo = tipo;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Director: " + director);
        System.out.println("Año: " + año);
        System.out.println("Tipo: " + tipo);
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Libro libro = new Libro(1, "Cien años de soledad", "Gabriel García Márquez", "Editorial XYZ");
        Revista revista = new Revista(2, "National Geographic", 123, 2022);
        DVD dvd = new DVD(3, "Inception", "Christopher Nolan", 2010, "Ciencia Ficción");

        libro.imprimirInfo();
        System.out.println();
        revista.imprimirInfo();
        System.out.println();
        dvd.imprimirInfo();
    }
}
