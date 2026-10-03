class Character {

    private int health;
    private final int maxHealth;

    // Constructor
    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    // Take damage
    public void takeDamage(int amount) {

        health = health - amount;

        if (health < 0) {
            health = 0;
        }
    }

    // Heal
    public void heal(int amount) {

        health = health + amount;

        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    // Getter
    public int getHealth() {
        return health;
    }
}

public class Health {

    public static void main(String[] args) {

        Character c = new Character(100);

        c.takeDamage(30);
        System.out.println("Health: " + c.getHealth());

        c.heal(50);
        System.out.println("Health: " + c.getHealth());

        c.takeDamage(150);
        System.out.println("Health: " + c.getHealth());
    }
}