import java.util.Random;
import java.util.Scanner;

clase pública Juego_Modulos_2 {

 público estático vacío main(String[] args) {
 Escáner escáner = nuevo Scanner(System.in);
 Aleatorio aleatorio = nuevo Aleatorio();

 System.out.println("Bienvenidos al juego de combate por turnos".);
 System.out.println("Cada jugador debe asignar sus estadísticas iniciales (Vida, Ataque, Defensa, Velocidad).");

 // Estadísticas iniciales
 int puntosTotales = 500;
 int maxPorEstadistica = 200;
 int vidaP1, ataqueP1, defensaP1, velocidadP1;
 int vidaP2, ataqueP2, defensaP2, velocidadP2;

 // Asignar estadísticas para el Jugador 1
 System.out.println("\nJugador 1, asigna tus estadísticas:");
 vidaP1 = asignarEstadisticas(escáner, "Vida", puntosTotales, maxPorEstadistica);
 puntosTotales -= vidaP1;

 ataqueP1 = asignarEstadisticas(escáner, "Ataque", puntosTotales, maxPorEstadistica);
 puntosTotales -= ataqueP1;

 defensaP1 = asignarEstadisticas(escáner, "Defensa", puntosTotales, maxPorEstadistica);
 puntosTotales -= defensaP1;

 velocidadP1 = puntosTotales; // Resto de los puntos
 puntosTotales = 500; // Reiniciar para el seguimiento jugador

 // Asignar estadísticas para el Jugador 2
 System.out.println("\nJugador 2, asigna tus estadísticas:");
 vidaP2 = asignarEstadisticas(escáner, "Vida", puntosTotales, maxPorEstadistica);
 puntosTotales -= vidaP2;

 ataqueP2 = asignarEstadisticas(escáner, "Ataque", puntosTotales, maxPorEstadistica);
 puntosTotales -= ataqueP2;

 defensaP2 = asignarEstadisticas(escáner, "Defensa", puntosTotales, maxPorEstadistica);
 puntosTotales -= defensaP2;

 velocidadP2 = puntosTotales; // Resto de los puntos

 // Mostrar estadísticas iniciales
 System.out.println("\nEstadísticas iniciales:");
 System.out.printf("Jugador 1 - Vida: %d, Ataque: %d, Defensa: %d, Velocidad: %d%n", vidaP1, ataqueP1, defensaP1, velocidadP1);
 System.out.printf("Jugador 2 - Vida: %d, Ataque: %d, Defensa: %d, Velocidad: %d%n", vidaP2, ataqueP2, defensaP2, velocidadP2);

 // Combatir los turnos
 System.out.println("\n¡Que comience el combate!");
 turnojugadorbooleano1 = velocidadP1 >= velocidadP2;

 mientras (vidaP1 > 0 && vidaP2 > 0) {
 if (turnoJugador1) {
 System.out.println("\nTurno del Jugador 1:");
 vidaP2 = realizarTurno(escáner, aleatorio, vidaP2, ataqueP1, defensaP2);
 } más {
 System.out.println("\nTurno del Jugador 2:");
 vidaP1 = realizarTurno(escáner, aleatorio, vidaP1, ataqueP2, defensaP1);
            }

 // Verificar condiciones de victoria
 si (vidaP1 <= 0) {
 System.out.println("\n¡Jugador 2 ha ganado!");
 mameluco;
 } else if (vidaP2 <= 0) {
 System.out.println("\n¡Jugador 1 ha ganado!");
 mameluco;
            }

 turnoJugador1 =!turnoJugador1; // Cambiar turno

 // Mostrar vida de ambos jugadores desesperados de un turno completo
 dacă (!turnoJugador1) { // Se muerte tras finalizar los turnos de ambos jugadores
 System.out.println("\nEstado actual de los jugadores:");
 Sistema apagado.printf("Jugador 1 - Vida restaurante: %d%n", vidaP1);
 Sistema apagado.printf("Jugador 2 - Vida restaurante: %d%n", vidaP2);
            }
        }

 escáner.cerca();
    }

 // Metodo para asignar estadísticas
 publico estatico int asignarEstadísticas (Escáner escáner, Cadena nombreEstadística, int puntosRestantes, int maxPorEstadística) {
 valor int;
 hacer {
 Sistema apagado.printf("¿Cuentos puntos designa un %s? (0-%d): ", nombreEstadística, Matemáticas.min(puntosRestantes, maxPorEstadística));
 escáner valor =.siguienteInt();
 si (valor < 0 || valor > Matemáticas.min(puntosRestantes, maxPorEstadística)) {
 Sistema apagado.imprimirln(„Valor inválido. Intenta de nuevo.");
            }
 } mientras (valor < 0 || valor > Matemáticas.min(puntosRestantes, maxPorEstadística));
 devuelve valor;
    }

 // Metodo para realizar un turno
 publico estatico int realizadorTurno (Escáner escáner, Aleatorio aleatorio, int vidaOponente, int ataque, int defensaoponente) {
 System.out.println("Elige tu acción:\n1. Atacar\n2. Curso\n3. Pasar turno");
 int accione escáner =.siguienteInt();

 interruptor (acceso) {
 caso 1: // Ataque
 booleano escrítico = aleatorio.siguienteInt(100) < 20; // 20% de probabilidad de critico
 int daaño = ataque - (defensaOponente / 2);
 si (esCrítico) {
 daño *= 1.5;
 Sistema apagado.imprimirln("Ataque critico!");
                }
 daño = Matemáticas.max(daño, 0); // No puede haber día negativo
 vidaOponente -= daño;
 System.out.printf(„Ha causado %d puntos de daño. Vida restaurante del oponente: %d%n", daño, vidaOponente);
 mameluco;

 caso 2: // Curso
 int curación = 30;
 vidaOponente += curacion;
 Sistema apagado.printf("Te ha corado %d puntos de vida.%n", curacion);
 mameluco;

 caso 3: // Pasar turno
 System.out.println(„Ha pasado tu turno".);
 mameluco;

 predeterminat:
 Sistema apagado.imprimirln(„Opción no válida. Pierdes tu turno.");
        }

 devuelve vidaOponente;
    }
}
