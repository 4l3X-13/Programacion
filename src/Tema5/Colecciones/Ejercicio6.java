package Programacion;

import java.util.ArrayList;
import java.util.Random;

class Hero {
    String nombre;
    int vida;
    int ataque;
    int defensa;

    public Hero(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void recibirAtaque(int dano) {
        int danoRecibido = Math.max(dano - defensa, 0);
        vida -= danoRecibido;
        System.out.println(nombre + " ha recibido " + danoRecibido + " puntos de daño.");
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void atacar(Enemigo enemigo) {
        Random random = new Random();
        int dano = ataque + random.nextInt(10); // Dano aleatorio
        enemigo.recibirAtaque(dano);
        System.out.println(nombre + " ataca a " + enemigo.getNombre() + " con " + dano + " puntos de daño.");
    }

    public void descansar() {
        Random random = new Random();
        if (random.nextInt(1000) < 1) { // 0.1% de probabilidad
            int vidaRecuperada = 50;
            vida += vidaRecuperada;
            System.out.println(nombre + " descansa y recupera " + vidaRecuperada + " puntos de vida.");
        }
    }

    public void encontrarPocion() {
        Random random = new Random();
        if (random.nextInt(10) == 0) { // 10% de probabilidad
            int vidaRecuperada = 30;
            vida += vidaRecuperada;
            System.out.println(nombre + " ha encontrado una poción y recupera " + vidaRecuperada + " puntos de vida.");
        }
    }
}

class Enemigo {
    String nombre;
    int vida;
    int ataque;

    public Enemigo(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void recibirAtaque(int dano) {
        vida -= dano;
        System.out.println(nombre + " ha recibido " + dano + " puntos de daño.");
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void atacar(Hero hero) {
        Random random = new Random();
        int dano = ataque + random.nextInt(5); // Dano aleatorio
        hero.recibirAtaque(dano);
        System.out.println(nombre + " ataca a " + hero.nombre + " con " + dano + " puntos de daño.");
    }

    public String getNombre() {
        return nombre;
    }

    public boolean huir() {
        Random random = new Random();
        return random.nextInt(10) == 0; // 10% de probabilidad de huir
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        Random random = new Random();
        Hero heroe = new Hero("Hero", 100, 20, 5);
        int hordasSuperadas = 0;

        while (heroe.estaVivo()) {
            System.out.println("\nHa comenzado la horda " + (hordasSuperadas + 1));
            ArrayList<Enemigo> enemigos = new ArrayList<>();
            int numeroEnemigos = random.nextInt(3) + 1;

            for (int i = 0; i < numeroEnemigos; i++) {
                enemigos.add(new Enemigo("Enemigo" + (i + 1), 30, 10));
            }

            while (!enemigos.isEmpty() && heroe.estaVivo()) {
                for (int i = 0; i < enemigos.size(); i++) {
                    Enemigo enemigo = enemigos.get(i);

                    if (enemigo.huir()) {
                        System.out.println(enemigo.getNombre() + " ha huido de la pelea.");
                        enemigos.remove(i);
                        i--; // Ajustamos el índice
                    } else {
                        enemigo.atacar(heroe);
                    }
                }

                if (heroe.estaVivo()) {
                    heroe.atacar(enemigos.get(0));
                    enemigos.removeIf(enemigo -> !enemigo.estaVivo()); // Eliminar enemigos muertos
                }
            }

            if (heroe.estaVivo()) {
                hordasSuperadas++;
                heroe.descansar();
                heroe.encontrarPocion();
            }
        }

        System.out.println("\nGame Over. Has sobrevivido a " + hordasSuperadas + " hordas.");
    }
}
