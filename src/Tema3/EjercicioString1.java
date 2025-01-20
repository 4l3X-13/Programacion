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
}
