package Programacion;

class Heroe {
    private static final int CURACION_POCION = 10;
    private static final int CURACION_DESCANSO = 50;
    private static final int EXP_POR_ATAQUE = 10;
    private static final int EXP_NECESARIA_NIVEL = 50;
    private static final int AUMENTO_VIDA_NIVEL = 5;
    private static final int AUMENTO_ATAQUE_NIVEL = 1;
    private static final int AUMENTO_DEFENSA_NIVEL = 1;
    private static final int DANIO_MINIMO = 10;

    private String nombre;
    private int nivel;
    private int vida;
    private int vidaMaxima;
    private int experiencia;
    private int ataque;
    private int defensa;

    public Heroe(String nombre, int nivel, int vidaMaxima, int ataque, int defensa) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.experiencia = 0;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void beberPocion() {
        vida = Math.min(vida + CURACION_POCION, vidaMaxima);
    }

    public void descansar() {
        vida = Math.min(vida + CURACION_DESCANSO, vidaMaxima);
    }

    public void atacar(Heroe enemigo) {
        int danio = Math.max(ataque - enemigo.defensa, DANIO_MINIMO);
        enemigo.vida = Math.max(enemigo.vida - danio, 0);
        ganarExperiencia(EXP_POR_ATAQUE);
    }

    private void ganarExperiencia(int cantidad) {
        experiencia += cantidad;
        if (experiencia >= EXP_NECESARIA_NIVEL) {
            subirNivel();
            experiencia -= EXP_NECESARIA_NIVEL;
        }
    }

    private void subirNivel() {
        nivel++;
        vidaMaxima += AUMENTO_VIDA_NIVEL;
        vida = vidaMaxima;
        ataque += AUMENTO_ATAQUE_NIVEL;
        defensa += AUMENTO_DEFENSA_NIVEL;
    }

    @Override
    public String toString() {
        return "Heroe{" + "nombre='" + nombre + "', nivel=" + nivel + ", vida=" + vida + ", vidaMaxima=" + vidaMaxima + ", experiencia=" + experiencia + ", ataque=" + ataque + ", defensa=" + defensa + '}';
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Heroe heroe1 = new Heroe("Guerrero", 1, 100, 20, 5);
        Heroe heroe2 = new Heroe("Orco", 1, 120, 15, 8);

        System.out.println(heroe1);
        System.out.println(heroe2);

        heroe1.atacar(heroe2);
        System.out.println("Después del ataque:");
        System.out.println(heroe1);
        System.out.println(heroe2);

        heroe2.beberPocion();
        System.out.println("Después de beber poción:");
        System.out.println(heroe2);
    }
}
