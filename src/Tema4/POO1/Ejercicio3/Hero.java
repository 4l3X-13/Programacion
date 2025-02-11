public class Hero {
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    private static final int EXP_TO_LEVEL_UP = 50;
    private static final int POTION_HEAL = 10;
    private static final int REST_HEAL = 50;
    private static final int MIN_DAMAGE = 10;

    public Hero(String name, int level, int maxHealth, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.experience = 0;
        this.attack = attack;
        this.defense = defense;
    }

    public void drinkPotion() {
        health = Math.min(health + POTION_HEAL, maxHealth);
    }

    public void rest() {
        health = Math.min(health + REST_HEAL, maxHealth);
    }

    public void attack(Hero enemy) {
        int damage = Math.max(this.attack - enemy.defense, MIN_DAMAGE);
        enemy.health = Math.max(enemy.health - damage, 0);
        this.experience += 10;
        if (this.experience >= EXP_TO_LEVEL_UP) {
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

    @Override
    public String toString() {
        return "Hero{name='" + name + "', level=" + level + ", health=" + health + "/" + maxHealth +
               ", attack=" + attack + ", defense=" + defense + ", experience=" + experience + "}";
    }
}
