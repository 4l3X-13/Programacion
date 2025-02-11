public class Hero {
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    public Hero(String name, int maxHealth, int attack, int defense) {
        this.name = name;
        this.level = 1;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.experience = 0;
        this.attack = attack;
        this.defense = defense;
    }

    public void drinkPotion() {
        health += 10;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public void rest() {
        health += 50;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public void attack(Hero enemy) {
        int damage = attack - enemy.defense;
        if (damage < 10) {
            damage = 10;
        }
        enemy.health -= damage;
        if (enemy.health < 0) {
            enemy.health = 0;
        }
        experience += 10;
        if (experience >= 50) {
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        maxHealth += 5;
        health = maxHealth;
        attack += 1;
        defense += 1;
        experience = 0;
    }

    public String toString() {
        return "Hero: " + name + ", Level: " + level + ", Health: " + health + "/" + maxHealth;
    }

    public static void main(String[] args) {
        Hero hero1 = new Hero("Guerrero", 100, 20, 5);
        Hero hero2 = new Hero("Orco", 120, 15, 8);

        System.out.println(hero1);
        System.out.println(hero2);

        hero1.attack(hero2);
        System.out.println("Después del ataque:");
        System.out.println(hero1);
        System.out.println(hero2);
    }
}
