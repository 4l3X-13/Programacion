public class Ejercicio10 {
    public static void main(String[] args) {
        // Pruebas de las funciones de MyMath

        // Cuadrado
        double squareSide = 5;
        System.out.println("Perímetro del cuadrado: " + MyMath.squarePerimeter(squareSide));
        System.out.println("Área del cuadrado: " + MyMath.squareArea(squareSide));

        // Rectángulo
        double rectangleLength = 10;
        double rectangleWidth = 5;
        System.out.println("Perímetro del rectángulo: " + MyMath.rectanglePerimeter(rectangleLength, rectangleWidth));
        System.out.println("Área del rectángulo: " + MyMath.rectangleArea(rectangleLength, rectangleWidth));

        // Círculo
        double circleRadius = 7;
        System.out.println("Perímetro del círculo: " + MyMath.circlePerimeter(circleRadius));
        System.out.println("Área del círculo: " + MyMath.circleArea(circleRadius));

        // Verificación de números primos
        int primeTestNumber = 29;
        System.out.println("¿Es " + primeTestNumber + " primo? " + MyMath.isPrime(primeTestNumber));
        System.out.println("¿Es " + primeTestNumber + " no primo? " + MyMath.isNotPrime(primeTestNumber));

        // Número de dígitos
        int digitTestNumber = -12345;
        System.out.println("Número de dígitos en " + digitTestNumber + ": " + MyMath.numberOfDigits(digitTestNumber));

        // Dígitos pares e impares
        System.out.println("Número de dígitos pares en " + digitTestNumber + ": " + MyMath.countEvenDigits(digitTestNumber));
        System.out.println("Número de dígitos impares en " + digitTestNumber + ": " + MyMath.countOddDigits(digitTestNumber));

        // Factorial
        int factorialTestNumber = 5;
        System.out.println("Factorial de " + factorialTestNumber + ": " + MyMath.factorial(factorialTestNumber));
        System.out.println("Factorial de " + factorialTestNumber + " (recursivo): " + MyMath.factorialRecursive(factorialTestNumber));

        // Ecuación cuadrática
        double a = 1, b = 2, c = -3;
        System.out.println("Número de soluciones para la ecuación x^2 + 2x - 3 = 0: " + MyMath.quadraticEquationSolutions(a, b, c));

        // Suma de dígitos
        System.out.println("Suma de los dígitos en " + digitTestNumber + ": " + MyMath.sumOfDigits(digitTestNumber));
    }
}
