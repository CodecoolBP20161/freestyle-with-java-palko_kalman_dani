package classes;

public class Monster  {
    private String name;
    private int health;
    private int damagePerHit;

    public Monster(String name, int health, int damagePerHit) {
        this.name = name;
        this.health = health;
        this.damagePerHit = damagePerHit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamagePerHit() {
        return damagePerHit;
    }

    public void setDamagePerHit(int damagePerHit) {
        this.damagePerHit = damagePerHit;
    }
}

