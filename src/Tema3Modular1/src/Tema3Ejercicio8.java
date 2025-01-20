importar java. . . . . . .util.Scanner;

publico clase Tema3Ejercicio8 {
 publico estatico vacio director(Cadena[] argumentos) {
 Escaneador escáser = nuevo Escáner(Sistema.en);

        // Pedir día, mes y año al habitual
 Sistema apagado.imprimirln("Presenta el día (1-31):");
 int dia escáser =.siguienteInt();

 Sistema apagado.imprimirln(„Presenta el mes (1-12):");
 int mes escáner =.siguienteInt();

 Sistema apagado.imprimirln("Presenta el año:");
 int aaaaaaño escáser =.siguienteInt();

        // Cerrar el escáner
 escáner.cerca();

        // Comprobar si la fecha es válida
        si (isValidDate(dia mes uno)) {
 Sistema apagado.imprimirln(„La fecha es corregir".);
        } mas {
 Sistema apagado.imprimirln("La fecha no es correcta".);
        }
    }

 publico estatico booleano isValidDate(int dia, int mes, int aaaaño) {
        // Comprobar si el mes está entre 1 y 12
 si (mes < 1 || mes > 12) {
 volver falso;
        }

        // Comprobar los días según el mes
 int días máximos = 0;
        cambiar (mes) {
 caso 1: caso 3: caso 5: caso 7: caso 8: caso 10: caso 12:
 maxDays = 31;
 mameluco;
 caso 4: caso 6: caso 9: caso 11:
 maxDays = 30;
 mameluco;
 caso 2:
                si (este año bisiesto(año)) {
 maxDays = 29;
                } mas {
 dicomo maximos = 28;
                }
 mameluco;
 predeterminat:
 volver falso;
        }

        // Comprobar si el día está dentro del rango válido
 volver dia >= 1 && day <= maxDays;
    }

 público blico booleano booleano onu onu bisiesto(año) {
        // Un año es bisiesto si es divisible entre 4, pero no entre 100, excepto si es divisible entre 400
 si si (uno % 4 == 0) {
 si si (año % 100 != 0 || año % 400 == 0) {
 volver verdedero;
            }
        }
 volver falso;
    }
}
