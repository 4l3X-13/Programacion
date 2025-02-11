public class MainHero {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Guerrero", 1, 100, 20, 5);
        Hero hero2 = new Hero("Orco", 1, 80, 15, 3);

        System.out.println(hero1);
        System.out.println(hero2);

        hero1.attack(hero2);
        System.out.println("Después del ataque:");
        System.out.println(hero1);
        System.out.println(hero2);

        hero2.drinkPotion();
        System.out.println("Después de que el Orco beba poción:");
        System.out.println(hero2);
    }
}
