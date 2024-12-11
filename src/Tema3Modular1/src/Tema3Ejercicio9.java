importar java. . . . . . .util.Scanner;

clase pública Tema3Ejercicio9 
 publico estatico vacio director(Cadena[] argumentos) {
 Escaneador escáser = nuevo Escáner(Sistema.en);

 // Pedir el cocheter y el número de líneas al usuario
 Sistema apagado.imprimirln("Introducir el carácter para el juicio:");
 char personaje escáner =.siguiente().charat(0);

 Sistema apagado.imprimirln("Presentar el número de líneas del juicio:");
 int líneas escáser =.siguienteInt();

 // Cerrar el escáner
 escáner.cerca();

 // Llamar al procedimiento para imprimir el juicio
 imprimirTriángulo(personaje, lineas);
    }

 imprimirtriangulo vacio estatico publico (carácter de personaje, líneas int) {
 estrellas int = 1; // Número inicial de personas por línea

 parr (int i = 1; yo <= líneas; i++) {
 // Imprimir los personajes en la línea actual
 parr (int j = 1; j <= estrellas; j++) {
 Sistema.out.print(personaje);
            }
 Sistema apagado.imprimirln(); // Saltar a la siguiente línea
 estrellas += 2; // Incrementar el número de personas en la siguiente línea
        }
    }
}
