package Programacion.POO3;
interface Publicacion {
    void publicar();
    void compartir();
}

interface AbrirPublicacion {
    void abrir();
}

class PublicacionTexto implements Publicacion {
    public void publicar() {
        System.out.println("Publicando un texto...");
    }

    public void compartir() {
        System.out.println("Compartiendo el texto...");
    }
}

class PublicacionFoto implements Publicacion, AbrirPublicacion {
    public void publicar() {
        System.out.println("Publicando una foto...");
    }

    public void compartir() {
        System.out.println("Compartiendo la foto...");
    }

    public void abrir() {
        System.out.println("Abriendo la foto...");
    }
}

class PublicacionVideo implements Publicacion, AbrirPublicacion {
    public void publicar() {
        System.out.println("Publicando un video...");
    }

    public void compartir() {
        System.out.println("Compartiendo el video...");
    }

    public void abrir() {
        System.out.println("Abriendo el video...");
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        PublicacionTexto texto = new PublicacionTexto();
        PublicacionFoto foto = new PublicacionFoto();
        PublicacionVideo video = new PublicacionVideo();

        texto.publicar();
        texto.compartir();

        foto.publicar();
        foto.compartir();
        foto.abrir();

        video.publicar();
        video.compartir();
        video.abrir();
    }
}
