package tema7.Ficheros;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

class Funko2 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private LocalDate fechaLanzamiento;

    public Funko2(String cod, String nombre, String modelo, double precio, LocalDate fechaLanzamiento) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getCod() {
        return cod;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "Funko{" +
                "cod='" + cod + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", fechaLanzamiento=" + fechaLanzamiento +
                '}';
    }
}

public class Ejercicio2 {
    // Ruta del archivo binario
    private static final String RUTA_ARCHIVO_BINARIO = "src/tema7/Ficheros/funkos.dat";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funko> funkos = loadFunkos();

        int opcion;
        do {
            System.out.println("--- MENÚ FUNKOS ---");
            System.out.println("1. Añadir funko");
            System.out.println("2. Borrar funko");
            System.out.println("3. Mostrar todos los funkos");
            System.out.println("4. Mostrar funko más caro");
            System.out.println("5. Mostrar media de precios");
            System.out.println("6. Mostrar funkos agrupados por modelo");
            System.out.println("7. Mostrar funkos del 2023");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> {
                    System.out.print("Código: ");
                    String cod = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = Double.parseDouble(sc.nextLine());
                    System.out.print("Fecha de lanzamiento (yyyy-MM-dd): ");
                    LocalDate fecha = LocalDate.parse(sc.nextLine(), FORMATTER);

                    Funko nuevo = new Funko(cod, nombre, modelo, precio, fecha);
                    funkos.add(nuevo);
                    saveFunkos(funkos);
                    System.out.println("Funko añadido.");
                }

                case 2 -> {
                    System.out.print("Introduce el código del funko a borrar: ");
                    String codABorrar = sc.nextLine();
                    boolean eliminado = funkos.removeIf(f -> f.getCod().equalsIgnoreCase(codABorrar));
                    if (eliminado) {
                        saveFunkos(funkos);
                        System.out.println("Funko borrado.");
                    } else {
                        System.out.println("Funko no encontrado.");
                    }
                }

                case 3 -> {
                    if (funkos.isEmpty()) {
                        System.out.println("No hay funkos para mostrar.");
                    } else {
                        funkos.forEach(System.out::println);
                    }
                    System.out.println("Pulsa ENTER para continuar...");
                    sc.nextLine();
                }

                case 4 -> {
                    Optional<Funko> masCaro = funkos.stream()
                            .max(Comparator.comparingDouble(Funko::getPrecio));
                    masCaro.ifPresentOrElse(
                            System.out::println,
                            () -> System.out.println("No hay funkos.")
                    );
                }

                case 5 -> {
                    double media = funkos.stream()
                            .mapToDouble(Funko::getPrecio)
                            .average()
                            .orElse(0.0);
                    System.out.println("Precio medio: " + String.format("%.2f", media) + " €");
                }

                case 6 -> {
                    Map<String, List<Funko>> agrupados = funkos.stream()
                            .collect(Collectors.groupingBy(Funko::getModelo));

                    agrupados.forEach((modelo, lista) -> {
                        System.out.println("Modelo: " + modelo);
                        lista.forEach(System.out::println);
                        System.out.println();
                    });
                }

                case 7 -> {
                    funkos.stream()
                            .filter(f -> f.getFechaLanzamiento().getYear() == 2023)
                            .forEach(System.out::println);
                }

                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static ArrayList<Funko> loadFunkos() {
        ArrayList<Funko> lista = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA_ARCHIVO_BINARIO))) {
            lista = (ArrayList<Funko>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudo leer el archivo binario o está vacío. Se creará una lista vacía.");
        }
        return lista;
    }

    private static void saveFunkos(List<Funko> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_ARCHIVO_BINARIO))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.err.println("No se pudo guardar el archivo binario: " + e.getMessage());
        }
    }
}
