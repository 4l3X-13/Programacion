package tema7.RankingDeVideojuegos;
import java.io.*;
import java.util.*;
import java.util.logging.*;

class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String message) {
        super(message);
    }
}

class JuegoNoEncontradoException extends Exception {
    public JuegoNoEncontradoException(String message) {
        super(message);
    }
}

abstract class Videojuego implements Serializable {
    protected String titulo;
    protected String plataforma;
    protected int nota;

    public Videojuego(String titulo, String plataforma, int nota) throws NotaInvalidaException {
        this.titulo = titulo;
        this.plataforma = plataforma;
        setNota(nota);
    }

    public void setNota(int nota) throws NotaInvalidaException {
        if (nota < 1 || nota > 10) {
            throw new NotaInvalidaException("La nota debe estar entre 1 y 10");
        }
        this.nota = nota;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return String.format("%s - %s (%s) - Nota: %d", titulo, plataforma, getTipo(), nota);
    }
}

class VideojuegoFisico extends Videojuego {
    private String tiendaCompra;
    private String estado;

    public VideojuegoFisico(String titulo, String plataforma, int nota, String tiendaCompra, String estado)
            throws NotaInvalidaException {
        super(titulo, plataforma, nota);
        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }

    @Override
    public String getTipo() {
        return "Físico";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - Tienda: %s - Estado: %s", tiendaCompra, estado);
    }
}

class VideojuegoDigital extends Videojuego {
    private String tiendaOnline;
    private double tamañoGB;

    public VideojuegoDigital(String titulo, String plataforma, int nota, String tiendaOnline, double tamañoGB)
            throws NotaInvalidaException {
        super(titulo, plataforma, nota);
        this.tiendaOnline = tiendaOnline;
        this.tamañoGB = tamañoGB;
    }

    @Override
    public String getTipo() {
        return "Digital";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - Tienda: %s - Tamaño: %.2f GB", tiendaOnline, tamañoGB);
    }
}

public class RankingVideojuegos {
    private static final Logger logger = Logger.getLogger(RankingVideojuegos.class.getName());
    private static List<Videojuego> ranking = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        try {
            FileHandler fh = new FileHandler("errores.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setLevel(Level.WARNING);
        } catch (IOException e) {
            System.err.println("Error al configurar el logger: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> añadirVideojuego();
                    case 2 -> mostrarRanking();
                    case 3 -> guardarRankingBinario();
                    case 4 -> cargarRankingBinario();
                    case 5 -> eliminarVideojuego();
                    case 6 -> exportarATexto();
                    case 0 -> salir = true;
                    default -> System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                logger.warning("Entrada no válida.");
                System.out.println("Error: Debes introducir un número.");
                scanner.nextLine();
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Error inesperado", e);
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }
        System.out.println("¡Hasta luego!");
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Ranking de Videojuegos ---");
        System.out.println("1. Añadir videojuego");
        System.out.println("2. Mostrar ranking");
        System.out.println("3. Guardar ranking");
        System.out.println("4. Cargar ranking");
        System.out.println("5. Eliminar videojuego");
        System.out.println("6. Exportar a texto");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void añadirVideojuego() {
        try {
            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Plataforma: ");
            String plataforma = scanner.nextLine();

            System.out.print("Nota (1-10): ");
            int nota = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Tipo (1-Físico / 2-Digital): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            Videojuego juego;

            if (tipo == 1) {
                System.out.print("Tienda de compra: ");
                String tienda = scanner.nextLine();

                System.out.print("Estado (nuevo/usado): ");
                String estado = scanner.nextLine();

                juego = new VideojuegoFisico(titulo, plataforma, nota, tienda, estado);
            } else if (tipo == 2) {
                System.out.print("Tienda online: ");
                String tienda = scanner.nextLine();

                System.out.print("Tamaño en GB (solo número): ");
                double tamaño = scanner.nextDouble();
                scanner.nextLine();

                juego = new VideojuegoDigital(titulo, plataforma, nota, tienda, tamaño);
            } else {
                System.out.println("Tipo no válido.");
                return;
            }

            ranking.add(juego);
            System.out.println("Videojuego añadido.");
        } catch (NotaInvalidaException e) {
            logger.warning(e.getMessage());
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            logger.warning("Entrada inválida.");
            System.out.println("Error: Entrada inválida.");
            scanner.nextLine();
        }
    }

    private static void mostrarRanking() {
        if (ranking.isEmpty()) {
            System.out.println("No hay videojuegos.");
            return;
        }

        ranking.sort(Comparator.comparingInt((Videojuego v) -> v.nota).reversed());

        System.out.println("\n--- Ranking de Videojuegos ---");
        for (int i = 0; i < ranking.size(); i++) {
            System.out.println((i + 1) + ". " + ranking.get(i));
        }
    }

    private static void guardarRankingBinario() {
        if (ranking.isEmpty()) {
            System.out.println("No hay videojuegos para guardar.");
            return;
        }

        System.out.print("Nombre del archivo: ");
        String nombreArchivo = scanner.nextLine() + ".dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(ranking);
            System.out.println("Guardado en " + nombreArchivo);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error al guardar", e);
            System.out.println("Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void cargarRankingBinario() {
        System.out.print("Archivo a cargar: ");
        String nombreArchivo = scanner.nextLine() + ".dat";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            ranking = (List<Videojuego>) ois.readObject();
            System.out.println("Cargado desde " + nombreArchivo);
        } catch (FileNotFoundException e) {
            logger.warning("Archivo no encontrado.");
            System.out.println("Error: El archivo no existe.");
        } catch (IOException | ClassNotFoundException e) {
            logger.log(Level.SEVERE, "Error al cargar", e);
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void eliminarVideojuego() {
        if (ranking.isEmpty()) {
            System.out.println("No hay videojuegos.");
            return;
        }

        System.out.print("Título del videojuego a eliminar: ");
        String titulo = scanner.nextLine();

        try {
            boolean eliminado = ranking.removeIf(j -> j.titulo.equalsIgnoreCase(titulo));

            if (eliminado) {
                System.out.println("Videojuego eliminado.");
            } else {
                throw new JuegoNoEncontradoException("No se encontró el videojuego: " + titulo);
            }
        } catch (JuegoNoEncontradoException e) {
            logger.warning(e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void exportarATexto() {
        if (ranking.isEmpty()) {
            System.out.println("No hay videojuegos para exportar.");
            return;
        }

        System.out.print("Nombre del archivo: ");
        String nombreArchivo = scanner.nextLine() + ".txt";

        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo))) {
            ranking.sort(Comparator.comparingInt((Videojuego v) -> v.nota).reversed());

            pw.println("--- Ranking de Videojuegos ---");
            for (int i = 0; i < ranking.size(); i++) {
                pw.println((i + 1) + ". " + ranking.get(i));
            }

            System.out.println("Exportado a " + nombreArchivo);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error al exportar", e);
            System.out.println("Error: " + e.getMessage());
        }
    }
}
