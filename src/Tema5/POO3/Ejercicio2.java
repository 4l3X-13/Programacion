package Programacion.POO3;
class Animal {
    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    public void hacerRuido() {
        System.out.println("El animal hace un ruido.");
    }
}

class Perro extends Animal {
    @Override
    public void hacerRuido() {
        System.out.println("El perro está ladrando.");
    }
}

class Gato extends Animal {
    @Override
    public void hacerRuido() {
        System.out.println("El gato está maullando.");
    }
}

class Vaca extends Animal {
    @Override
    public void hacerRuido() {
        System.out.println("La vaca está mugiendo.");
    }
}

class Oveja extends Animal {
    @Override
    public void hacerRuido() {
        System.out.println("La oveja está balando.");
    }
}

class Leon extends Animal {
    @Override
    public void hacerRuido() {
        System.out.println("El león está rugiendo.");
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();
        Animal oveja = new Oveja();
        Animal leon = new Leon();

        perro.comer();
        perro.hacerRuido();

        gato.comer();
        gato.hacerRuido();

        vaca.comer();
        vaca.hacerRuido();

        oveja.comer();
        oveja.hacerRuido();

        leon.comer();
        leon.hacerRuido();
    }
}
