importar java. . .util.Scanner;

clase pública EjerciciosArrays4 {
 publico estatico vacio director(Cadena[] argumentos) {
 Escaneador sc = nuevo Escáner(Sistema.en);

 // Crear el arreglo que representa las vivendas del hotel
 int[] habitacion = nuevo int[20];

 // Pedir al usuario el número de habitacion para instalar el enrutador
 Sistema apagado.imprimir("Presentar el número de habitacion donde instalar el enrutador (1-20): ");
 int habitacion =sc.siguienteInt();

 // Validar que la habitacion este entre 1 y 20
 movimientos (habitacion < 1 || habitancia > 20) {
 Sistema.out.print(„Número de habitacion inválido. . . Presentar onu número entrada 1 y 20: ");
 habitacion = sc.siguienteInt();
        }

 // Pedir al usuario la potencia del enrutador
 Sistema apagado.imprimir("Presentar la potencia de transmisión del enrutador (1-6): ");
 int potencia =sc.siguienteInt();

 // Validar que la potencia está entre 1 y 6
 mientras (potencia < 1 || potencia > 6) {
 Sistema.out.print(„Potencia inválida. Presentar onu número entre 1 y 6: ");
 potencia = sc.siguienteInt();
        }

 // Ajustar el índice del array a base 0
 int enrutador de posición = habitacion - 1;

 // Colocar la potencia en el array
 parr (int i = 0; i < habitaciones.longitud; i++) {
 int distancia = Matemáticas.abs(yo - posiciónRouter);
 si (distancia < potencia) {
 habitacion[i] = potencia - distancia;
 } mas {
 habitacion[i] = 0;
            }
        }

 // Mostrar el array final
 Sistema apagado.imprimirln("Resultado de la simulación de cobertura wifi:");
 parr (int i = 0; i < habitaciones.longitud; i++) {
 Sistema.out.print(habitacion[i] + " ");
        }

 sc.cerca();
    }
}
