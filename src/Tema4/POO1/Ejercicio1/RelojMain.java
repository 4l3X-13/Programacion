public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj();
        Reloj reloj2 = new Reloj(14, 30, 45);

        reloj1.mostrarHora();
        reloj2.mostrarHora();

        reloj1.setHora(9);
        reloj1.setMinuto(15);
        reloj1.setSegundo(10);
        reloj1.setFormato24h(false);

        reloj1.mostrarHora();

        System.out.println(reloj2);
    }
}
