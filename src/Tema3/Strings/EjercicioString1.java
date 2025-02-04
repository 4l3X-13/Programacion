package Tema3.Strings;

import java.util.Scanner;

public class EjercicioString1 {
    // MAIN
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opción: \n" +
                " 1. Invertir y poner en mayúsculas\n" +
                " 2. Contar vocales\n" +
                " 3. Encontrar la palabra más larga\n" +
                " 4. Contar ocurrencias\n" +
                " 5. Contar palabras\n" +
                " 6. Formatear número de teléfono\n" +
                " 7. Mostrar histograma de vocales");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingresa una cadena: ");
        String texto = scanner.nextLine();

        switch (eleccion) {
            case 1:
                String resultadoInvertido = invertirYmayusculas(texto);
                System.out.println("Cadena invertida y en mayúsculas: " + resultadoInvertido);
                break;
            case 2:
                int numeroVocales = contarVocales(texto);
                System.out.println("Número de vocales: " + numeroVocales);
                break;
            case 3:
                String palabraLarga = palabraMasLarga(texto);
                System.out.println("Palabra más larga: " + palabraLarga);
                break;
            case 4:
                System.out.print("Ingresa la cadena a buscar: ");
                String cadenaABuscar = scanner.nextLine();
                int ocurrencias = contarOcurrencias(texto, cadenaABuscar);
                System.out.println("Número de ocurrencias: " + ocurrencias);
                break;
            case 5:
                int numeroPalabras = contarPalabras(texto);
                System.out.println("Número de palabras: " + numeroPalabras);
                break;
            case 6:
                System.out.print("Ingresa el número de teléfono: ");
                String numeroTelefono = scanner.nextLine();
                String telefonoFormateado = formatearTelefono(numeroTelefono);
                System.out.println("Número de teléfono formateado: " + telefonoFormateado);
                break;
            case 7:
                mostrarHistogramaVocales(texto);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    // a) Función que invierte la cadena y la convierte en mayúsculas
    public static String invertirYmayusculas(String cadena) {
        return new StringBuilder(cadena).reverse().toString().toUpperCase();
    }

    // b) Función que cuenta el número de vocales
    public static int contarVocales(String cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (char c : cadena.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // c) Función que encuentra la palabra más larga
    public static String palabraMasLarga(String cadena) {
        String[] palabras = cadena.split(" ");
        String palabraMasLarga = "";

        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        return palabraMasLarga;
    }

    // d) Función que cuenta las ocurrencias de una palabra
    public static int contarOcurrencias(String texto, String palabraBuscada) {
        texto = texto.toLowerCase();
        palabraBuscada = palabraBuscada.toLowerCase();

        String[] palabras = texto.split(" ");
        int contador = 0;
        for (String palabra : palabras) {
            if (palabra.equals(palabraBuscada)) {
                contador++;
            }
        }
        return contador;
    }

    // e) Función que cuenta el número de palabras
    public static int contarPalabras(String cadena) {
        String[] palabras = cadena.split(" ");
        return palabras.length;
    }

    // f) Función que recibe un número de teléfono y lo convierte al formato (+34)-555-332211
    public static String formatearTelefono(String numero) {
        if (numero.length() < 11) {
            return "Número inválido";
        }
        String codigoPais = "+".concat(numero.substring(0, 2));
        String codigoArea = numero.substring(2, 5);
        String restoNumero = numero.substring(5);
        return String.format("(%s)-%s-%s", codigoPais, codigoArea, restoNumero);
    }

    // g) Procedimiento que muestra el histograma de frecuencias de las vocales
    public static void mostrarHistogramaVocales(String cadena) {
        int[] frecuencias = new int[5];
        String vocales = "aeiou";

        for (char c : cadena.toLowerCase().toCharArray()) {
            int index = vocales.indexOf(c);
            if (index != -1) {
                frecuencias[index]++;
            }
        }

        for (int i = 0; i < vocales.length(); i++) {
            System.out.print(vocales.charAt(i) + " " + frecuencias[i] + " ");
            for (int j = 0; j < frecuencias[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
