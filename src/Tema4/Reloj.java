package Tema4;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    private boolean is24h;

    public Reloj() {
    }
    public Reloj(int hora,int minuto,int segundo){
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora < 0 && hora > 24){
            System.out.println("Esta hora no es valida");
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
       if (minuto < 0 && minuto > 60){
           System.out.println("Este minuto no es valido");
       }
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 && segundo > 60){
            System.out.println("Este segundo no es valido");
        }
        this.segundo = segundo;
    }

    public boolean isIs24h() {
        return is24h;
    }

    public void setIs24h(boolean is24h) {
        this.is24h = is24h;
    }
}




