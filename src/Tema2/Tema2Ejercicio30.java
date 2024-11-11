package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                int num1, num2;
                boolean entra = true;
                char oper;

                System.out.println("Bienvenido a la calculadora. Introduce 'salir' en cualquier momento para finalizar.");

                while (entra) {
                    System.out.print("Introduce el primer número: ");
                    if (scan.hasNextInt()) {
                        num1 = scan.nextInt();
                    } else {
                        String input = scan.next();
                        if (input.equalsIgnoreCase("salir")) {
                            break;
                        } else {
                            System.out.println("Entrada no válida. Por favor, introduce un número.");
                            continue;
                        }
                    }

                    System.out.print("Introduce el segundo número: ");
                    if (scan.hasNextInt()) {
                        num2 = scan.nextInt();
                    } else {
                        String input = scan.next();
                        if (input.equalsIgnoreCase("salir")) {
                            break;
                        } else {
                            System.out.println("Entrada no válida. Por favor, introduce un número.");
                            continue;
                        }
                    }

                    System.out.println("Inserta la operación que deseas realizar: (+, -, *, /, %, s para salir)");
                    oper = scan.next().charAt(0);

                    switch (oper) {
                        case 's':
                            entra = false;
                            break;

                        case '+':
                            System.out.println("La suma es: " + (num1 + num2));
                            break;

                        case '-':
                            System.out.println("La resta es: " + (num1 - num2));
                            break;

                        case '*':
                            System.out.println("La multiplicación es: " + (num1 * num2));
                            break;

                        case '/':
                            if (num2 != 0) {
                                System.out.println("La división es: " + (num1 / num2));
                            } else {
                                System.out.println("Error: No se puede dividir por 0.");
                            }
                            break;

                        case '%':
                            if (num2 != 0) {
                                System.out.println("El resto es: " + (num1 % num2));
                            } else {
                                System.out.println("Error: No se puede calcular el resto con 0.");
                            }
                            break;

                        default:
                            System.out.println("Operación no válida. Intenta de nuevo.");
                            break;
                    }
                }

                System.out.println("Gracias por usar la calculadora.");
                scan.close();
            }
        }
