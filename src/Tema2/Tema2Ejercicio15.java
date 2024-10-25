import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();
        boolean esBisiesto;
        System.out.print("Ingrese el año: ");
        int ano = scanner.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 100 == 0 && ano % 400 == 0))
           esBisiesto = true;
        else
            esBisiesto = false;

        int dias;
        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2: // Febrero
                if (esBisiesto = true) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("Mes inválido. Debe estar entre 1 y 12.");
                return;
        }

        System.out.println("El mes " + mes + " del año " + ano + " tiene " + dias + " días.");
    }
}
