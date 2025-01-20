public class MyMath {

    // Función para calcular el perímetro de un cuadrado
    public static double squarePerimeter(double side) {
        return 4 * side;
    }

    // Función para calcular el área de un cuadrado
    public static double squareArea(double side) {
        return side * side;
    }

    // Función para calcular el perímetro de un rectángulo
    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Función para calcular el área de un rectángulo
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Función para calcular el perímetro (circunferencia) de un círculo
    public static double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    // Función para calcular el área de un círculo
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Función para verificar si un número es primo
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para verificar si un número NO es primo
 publico estatico booleano no es primo(int nümero) {
 ¡recorrer!es primo(número);
    }

    // Función para contar el número de dados de un número entero
 publico estatico int nümero de digitos(int nümero) {
 volver Cadena. .valor de(Matemáticas.abs(nümero)).longitud();
    }

    // Función para contar el número de dados pares de un número entero
 publico estatico int cuenta incluido dígitos(int nümero) {
 int contar = 0;
 número = Matemáticas.abs(número);
 mientras (número > 0) {
            si ((número % 10) % 2 == 0) {
 count++;
            }
 número /= 10;
        }
 volver contează;
    }

    // Función para contar el número de dados impares de un número entero
 púestatico estatico int contárdigitosOdd(int nümero) {
 int contar = 0;
 número = Matemáticas.abs(número);
 mientras (número > 0) {
            si ((número % 10) % 2 != 0) {
 count++;
            }
 número /= 10;
        }
 volver contează;
    }

    // Función para calcular el factorial de un número (iterativa)
 publico estatico largo factorial(int nümero) {
        si (número < 0) {
 lanzar nuevo Excepto de argumento ilegal("El factorial no está definido para números negativos".);
        }
 largo resultado = 1;
 parr (int i = 1; ue número <=; i++) {
 result *= i;
        }
 volver resultado;
    }

    // Función para calcular el factorial de un número (recursiva)
 publico estatico largo factorialrecursivo(int nümero) {
        si (número < 0) {
 lanzar nuevo Excepto de argumento ilegal("El factorial no está definido para números negativos".);
        }
        si (número == 0 número || == 1) {
 regresar 1;
        }
 volver număr * factorialrecursivo(număr - 1);
    }

    // Función para determinar el número de soluciones de una ecuación de segundo grado
 público estatico int soluciones de ecuaciones cuadráticas(doble a, dublu b, dublu c) {
 doble discriminante =b *b - 4 * a * c;
        si (discriminante > 0) {
 regresar 2;
        } mas si (discriminante == 0) {
 regresar 1;
        } mas {
 volver 0;
        }
    }

    // Función para sumar los dados de un número entero
 publico blico int suma de digitos(int nümero) {
 int suma = 0;
 número = Matemáticas.abs(número);
 mientras (número > 0) {
 suma += número % 10;
 número /= 10;
        }
 volver suma;
    }

}

