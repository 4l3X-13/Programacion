import java.util.Scanner;

public class Tema3Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Mostrar el menú
            System.out.println("\nMenú de Opciones:");
            System.out.println("a) Muestra el signo de un número");
            System.out.println("b) Indica si el usuario es mayor de edad");
            System.out.println("c) Calcula el área y perímetro de un círculo");
            System.out.println("d) Conversor de euros a dólares y viceversa");
            System.out.println("e) Mostrar tabla de multiplicar de un número");
            System.out.println("f) Mostrar tablas de multiplicar del 1 al 10");
            System.out.println("g) Comprobador de números primos");
            System.out.println("h) Comprobador de fechas");
            System.out.println("i) Dibujar triángulos");
            System.out.println("0) Salir");
            System.out.print("Elige una opción: ");

            // Leer la opción elegida
            String input = scanner.next();
            option = input.length() > 0 ? input.charAt(0) : '0';

            switch (option) {
                case 'a':
                    System.out.print("Introduce un número: ");
                    int number = scanner.nextInt();
                    System.out.println("El signo del número es: " + numberSign(number));
                    break;

                case 'b':
                    System.out.print("Introduce tu edad: ");
                    int age = scanner.nextInt();
                    System.out.println(isAdult(age) ? "Eres mayor de edad." : "No eres mayor de edad.");
                    break;

                case 'c':
                    System.out.print("Introduce el radio del círculo: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Área: " + circleArea(radius) + ", Perímetro: " + circlePerimeter(radius));
                    break;

                case 'd':
                    System.out.print("Introduce la cantidad: ");
                    double amount = scanner.nextDouble();
                    System.out.print("¿Es en euros (1) o dólares (2)? ");
                    int currency = scanner.nextInt();
                    System.out.println("Convertido: " + currencyConverter(amount, currency));
                    break;

                case 'e':
                    System.out.print("Introduce un número para la tabla: ");
                    int table = scanner.nextInt();
                    multiplicationTable(table);
                    break;

                case 'f':
                    multiplicationTables1to10();
                    break;

                case 'g':
                    System.out.print("Introduce un número: ");
                    int primeNumber = scanner.nextInt();
                    System.out.println(isPrime(primeNumber) ? "Es primo." : "No es primo.");
                    break;

                case 'h':
                    System.out.print("Introduce el día: ");
                    int day = scanner.nextInt();
                    System.out.print("Introduce el mes: ");
                    int month = scanner.nextInt();
                    System.out.print("Introduce el año: ");
                    int year = scanner.nextInt();
                    System.out.println(isValidDate(day, month, year) ? "La fecha es válida." : "La fecha no es válida.");
                    break;

                case 'i':
                    System.out.print("Introduce el carácter para el triángulo: ");
                    char character = scanner.next().charAt(0);
                    System.out.print("Introduce el número de líneas: ");
                    int lines = scanner.nextInt();
                    printTriangle(character, lines);
                    break;

                case '0':
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (option != '0');

        scanner.close();
    }

    public static String numberSign(int number) {
        return number > 0 ? "positivo" : (number < 0 ? "negativo" : "cero");
    }

 público 
 volver edad >= 18;
    }

 público estatico doble área circular(radio doble) {
 volver Matemáticas. .PI * radio * radio;
    }

 público estatico doble porimetro circular(radio doble) {
 volver 2 * Math.PI * radio;
    }

 público estatico doble convertidor de moneda(doble cantidad, int moneda) {
        final doble tasa de cambio = 1.1; // Ejemplo: 1 euro = 1.1 dólares
 volver moneda == 1 ? monto * tipo de cambio : monto / tipo de cambio;
    }

 público estatico vacío tabla de multiplicar(int nümero) {
 parr (int i = 1; ue <= 10; i++) {
 Sistema apagado. .imprimirln(número + " x " + i + " = " + (número *i));
        }
    }

 público estatico vacío tablas de multiplicar1 a 10() {
 parr (int i = 1; ue <= 10; i++) {
 tabla de multiplicar(i);
 Sistema apagado.imprimirln();
        }
    }

 público estatico booleano es primo(int nümero) {
 si (número <= 1) volver falso;
 parr (int i = 2; Yo <= Matemáticas.sqrt(número); i++) {
            si (número % i == 0) volver falso;
        }
 volver verdedero;
    }

 público estatico booleano isValidDate(int dia, int mes, int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaño) {
 si (mes < 1 || mes > 12) volver falso;
 int[] díasEnMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        si (mes == 2 && este añoooooo bisiesto(año)) diasenmes[1] = 29;
 volver dia >= 1 && dia <= díasEnMes[mes - 1];
    }

 público estatico booleano este onu bisiesto(int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaño) {
 volver (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

 público estatico vacío imprimirtriángulo(char personaje, int lineas) {
 int estrellas = 1;
; yo <= lineas; i++) {
 parr (int j = 1; j <= estrellas; j++) {
 Sistema apagado.imprimir(personaje);
            }
 Sistema apagado.imprimirln();
 estrellas += 2;
        }
    }
}
