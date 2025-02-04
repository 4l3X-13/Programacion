package Tema3.Strings;

public class EjercicioString2 {

    // Método para cifrar un mensaje
    public static String encrypt(String mensaje) {
        String result = "";
        mensaje = mensaje.toUpperCase();

        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                // Si es una letra, reemplazarla por la siguiente (Z -> A)
                if (c == 'Z') {
                    result += 'A';
                } else {
                    result += (char) (c + 1);
                }
            } else if (c >= '0' && c <= '9') {
                // Si es un dígito, reemplazarlo por el siguiente (9 -> 0)
                if (c == '9') {
                    result += '0';
                } else {
                    result += (char) (c + 1);
                }
            } else {
                result += c;
            }
        }

        return result;
    }

    // Método para descifrar un mensaje
    public static String decrypt(String mensajeEncriptado) {
        String result = "";
        mensajeEncriptado = mensajeEncriptado.toUpperCase();

        for (int i = 0; i < mensajeEncriptado.length(); i++) {
            char c = mensajeEncriptado.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                // Si es una letra, reemplazarla por la anterior (A -> Z)
                if (c == 'A') {
                    result += 'Z';
                } else {
                    result += (char) (c - 1);
                }
            } else if (c >= '0' && c <= '9') {
                // Si es un dígito, reemplazarlo por el anterior (0 -> 9)
                if (c == '0') {
                    result += '9';
                } else {
                    result += (char) (c - 1);
                }
            } else {
                // Si no es ni letra ni número, dejarlo como está
                result += c;
            }
        }

        return result;
    }

    // MAIN
    public static void main(String[] args) {
        String mensaje = "HOLA Z9!";
        System.out.println("Mensaje original: " + mensaje);

        // Probar cifrado
        String mensajeEncriptado = encrypt(mensaje);
        System.out.println("Mensaje cifrado: " + mensajeEncriptado);

        // Probar descifrado
        String mensajeDesencriptado = decrypt(mensajeEncriptado);
        System.out.println("Mensaje descifrado: " + mensajeDesencriptado);
    }
}
