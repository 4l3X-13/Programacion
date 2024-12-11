public class MyMath3 {

    // Function to calculate the perimeter of a square
    public static double squarePerimeter(double side) {
        return 4 * side;
    }

    // Function to calculate the area of a square
    public static double squareArea(double side) {
        return side * side;
    }

    // Function to calculate the perimeter of a rectangle
    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Function to calculate the area of a rectangle
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Function to calculate the perimeter (circumference) of a circle
    public static double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    // Function to calculate the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Function to check if a number is prime
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

    // Function to check if a number is NOT prime
    public static boolean isNotPrime(int number) {
        return !isPrime(number);
    }

    // Function to count the number of digits in an integer
    public static int numberOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static void main(String[] args) {
        // Test the functions
        double squareSide = 5;
        System.out.println("Square Perimeter: " + squarePerimeter(squareSide));
        System.out.println("Square Area: " + squareArea(squareSide));

        double rectangleLength = 10;
        double rectangleWidth = 5;
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter(rectangleLength, rectangleWidth));
        System.out.println("Rectangle Area: " + rectangleArea(rectangleLength, rectangleWidth));

        double circleRadius = 7;
        System.out.println("Circle Perimeter: " + circlePerimeter(circleRadius));
        System.out.println("Circle Area: " + circleArea(circleRadius));

        int primeTestNumber = 29;
        System.out.println("Is " + primeTestNumber + " prime? " + isPrime(primeTestNumber));
        System.out.println("Is " + primeTestNumber + " not prime? " + isNotPrime(primeTestNumber));

        int digitTestNumber = -12345;
        System.out.println("Number of digits in " + digitTestNumber + ": " + numberOfDigits(digitTestNumber));
    }
}
