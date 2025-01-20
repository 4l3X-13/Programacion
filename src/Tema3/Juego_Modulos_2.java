package Tema3;
import java.util.Random;
import java.util.Scanner;

public class Juego_Modulos_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Mensaje inicial
        System.out.println("Bienvenidos al juego de combate por turnos.");
        System.out.println("Cada jugador tiene 500 puntos para repartir entre sus estadísticas:");
        System.out.println("Vida, Ataque, Defensa y Velocidad.");

        // Estadísticas iniciales
        int puntosTotales = 500; // Puntos totales para repartir
        int maxPorEstadistica = 200; // Máximo por estadística
        int vidaP1, ataqueP1, defensaP1, velocidadP1;
        int vidaP2, ataqueP2, defensaP2, velocidadP2;

        // Repartir puntos para el Jugador 1
        System.out.println("\nJugador 1, reparte tus puntos:");
        vidaP1 = asignarEstadisticas(scanner, "Vida", puntosTotales, maxPorEstadistica);
        puntosTotales -= vidaP1;

        ataqueP1 = asignarEstadisticas(scanner, "Ataque", puntosTotales, maxPorEstadistica);
        puntosTotales -= ataqueP1;

        defensaP1 = asignarEstadisticas(scanner, "Defensa", puntosTotales, maxPorEstadistica);
        puntosTotales -= defensaP1;

        velocidadP1 = puntosTotales; // Los puntos restantes van a velocidad
        puntosTotales = 500; // Reiniciar puntos para el Jugador 2

        // Repartir puntos para el Jugador 2
        System.out.println("\nJugador 2, reparte tus puntos:");
        vidaP2 = asignarEstadisticas(scanner, "Vida", puntosTotales, maxPorEstadistica);
        puntosTotales -= vidaP2;

        ataqueP2 = asignarEstadisticas(scanner, "Ataque", puntosTotales, maxPorEstadistica);
        puntosTotales -= ataqueP2;

        defensaP2 = asignarEstadisticas(scanner, "Defensa", puntosTotales, maxPorEstadistica);
        puntosTotales -= defensaP2;

        velocidadP2 = puntosTotales; // Los puntos restantes van a velocidad

        // Mostrar las estadísticas de ambos jugadores
        System.out.println("\nEstadísticas iniciales:");
        System.out.printf("Jugador 1 - Vida: %d, Ataque: %d, Defensa: %d, Velocidad: %d%n", vidaP1, ataqueP1, defensaP1, velocidadP1);
        System.out.printf("Jugador 2 - Vida: %d, Ataque: %d, Defensa: %d, Velocidad: %d%n", vidaP2, ataqueP2, defensaP2, velocidadP2);

        // Iniciar combate
        System.out.println("\n¡Que comience el combate!");
        boolean turnoJugador1 = velocidadP1 >= velocidadP2; // Comienza el jugador con más velocidad

        // Bucle principal del juego
        while (vidaP1 > 0 && vidaP2 > 0) {
            if (turnoJugador1) {
                System.out.println("\nTurno del Jugador 1:");
                vidaP2 = realizarTurno(scanner, random, vidaP2, ataqueP1, defensaP2);
            } else {
                System.out.println("\nTurno del Jugador 2:");
                vidaP1 = realizarTurno(scanner, random, vidaP1, ataqueP2, defensaP1);
            }

            // Mostrar estado después de cada turno
            System.out.printf("Vida restante - Jugador 1: %d, Jugador 2: %d%n", vidaP1, vidaP2);

            // Comprobar victoria
            if (vidaP1 <= 0) {
                System.out.println("\n¡Jugador 2 ha ganado!");
                break;
            }
            if (vidaP2 <= 0) {
                System.out.println("\n¡Jugador 1 ha ganado!");
                break;
            }

            // Cambiar turno
            turnoJugador1 = !turnoJugador1;
        }

        // Cerrar el escáner
        scanner.close();
    }

    // Método para asignar puntos a una estadística
    public static int asignarEstadisticas(Scanner scanner, String nombreEstadistica, int puntosRestantes, int maxPorEstadistica) {
        int valor;
        do {
            System.out.printf("¿Cuántos puntos quieres asignar a %s? (0-%d): ", nombreEstadistica, Math.min(puntosRestantes, maxPorEstadistica));
            valor = scanner.nextInt();
            if (valor < 0 || valor > Math.min(puntosRestantes, maxPorEstadistica)) {
                System.out.println("Error: el valor no es válido. Inténtalo de nuevo.");
            }
        } while (valor < 0 || valor > Math.min(puntosRestantes, maxPorEstadistica));
        return valor;
    }

    // Método para realizar un turno
    public static int realizarTurno(Scanner scanner, Random random, int vidaOponente, int ataque, int defensaOponente) {
        System.out.println("Elige tu acción:\n1. Atacar\n2. Curar\n3. Pasar turno");
        int accion = scanner.nextInt();

        switch (accion) {
            case 1: // Atacar
                boolean esCritico = random.nextInt(100) < 20; // 20% de probabilidad de crítico
                int danyo = ataque - (defensaOponente / 2);
                if (esCritico) {
                    danyo *= 1.5;
                    System.out.println("¡Ataque crítico!");
                }
                danyo = Math.max(danyo, 0); // Evitar daño negativo
                vidaOponente -= danyo;
                System.out.printf("Has causado %d puntos de daño. Vida restante del oponente: %d%n", danyo, vidaOponente);
                break;

            case 2: // Curar
                int curacion = 30;
                vidaOponente += curacion;
                System.out.printf("Te has curado %d puntos de vida.%n", curacion);
                break;

            case 3: // Pasar turno
                System.out.println("Has pasado tu turno.");
                break;

            default:
                System.out.println("Opción no válida. Pierdes tu turno.");
        }

        return vidaOponente;
    }
}