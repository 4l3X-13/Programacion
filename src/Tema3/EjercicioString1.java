package Tema3;

public class EjercicioString1 {

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
        String[] palabras = cadena.split("\\s+");
        String mayor = "";
        for (String palabra : palabras) {
            if (palabra.length() > mayor.length()) {
                mayor = palabra;
            }
        }
        return mayor;
    }

    // Método principal para ejecutar las funciones
    public static void main(String[] args) {
        String texto = "Hola, este es un ejemplo de texto para probar las funciones.";

        // Llamada a la función invertirYmayusculas
        String resultadoInvertido = invertirYmayusculas(texto);
        System.out.println("Cadena invertida y en mayúsculas: " + resultadoInvertido);

        // Llamada a la función contarVocales
        int numeroVocales = contarVocales(texto);
        System.out.println("Número de vocales: " + numeroVocales);

        // Llamada a la función palabraMasLarga
        String palabraLarga = palabraMasLarga(texto);
        System.out.println("Palabra más larga: " + palabraLarga);
    }
}
