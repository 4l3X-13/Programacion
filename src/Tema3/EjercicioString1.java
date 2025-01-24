package Tema3;

import java.util.Scanner;
public class EjercicioString1 {
    // MAIN
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opción: " +
                " 1. Invertir y poner en mayúsculas" +
                " 2. Contar vocales" +
                " 3. Encontrar la palabra más larga" +
                " 4. Contar ocurrencias");
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
                // Llamada a la función contarOcurrencias
                System.out.print("Ingresa la cadena a buscar: ");
                String cadenaABuscar = scanner.nextLine();
                int ocurrencias = contarOcurrencias(texto, cadenaABuscar);
                System.out.println("Número de ocurrencias: " + ocurrencias);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }


    //a) Función que invierte la cadena y la convierte en mayúsculas
    public static String invertirYmayusculas (String cadena){
        return new StringBuilder(cadena).reverse().toString().toUpperCase();
    }


    //b) Función que cuenta el número de vocales
    public static int contarVocales(String cadena){
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (char c : cadena.toCharArray()) {
            if(vocales.indexOf(c) != -1) {
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


    //d) Función que recibe dos cadenas y devuelve el número de veces que la segunda cadena esté incluida en la primera.
    public static int contarOcurrencias(String cadena1, String cadena2) {
        int contador = 0, index = 0;
        while ((index = cadena1.indexOf(cadena2, index)) != -1) {
            contador++;
            index++;
        }
        return contador;
    }













}