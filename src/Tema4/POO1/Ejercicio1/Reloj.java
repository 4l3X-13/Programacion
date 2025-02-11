class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    private boolean formato24h; // true = 24 horas, false = 12 horas

    // Constructor vacío
    public Reloj() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
        this.formato24h = true; // Por defecto en formato 24 horas
    }

    // Constructor con parámetros
    public Reloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
        this.formato24h = true;
    }

    // Getters y Setters con validaciones
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida, debe estar entre 0 y 23.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido, debe estar entre 0 y 59.");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido, debe estar entre 0 y 59.");
        }
    }

    public boolean isFormato24h() {
        return formato24h;
    }

    public void setFormato24h(boolean formato24h) {
        this.formato24h = formato24h;
    }

    // Método para mostrar la hora
    public void mostrarHora() {
        if (formato24h) {
            System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
        } else {
            int hora12 = hora % 12;
            if (hora12 == 0) hora12 = 12;
            String periodo = (hora < 12) ? "AM" : "PM";
            System.out.printf("%02d:%02d:%02d %s\n", hora12, minuto, segundo, periodo);
        }
    }

    // Método toString
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
