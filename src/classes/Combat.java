package classes;

public class Combat {
    public String fight(Player player, Monster monster){
        int playerHealth = player.getHealth();
        int playerDamage = player.getDamagePerHit();
        int monsterHealth = monster.getHealth();
        int monsterDamage = monster.getDamagePerHit();
        while (true) {
            if ((monsterHealth -= playerDamage) <= 0) return player.getName();
            if ((playerHealth -= monsterDamage) <= 0) return monster.getName();
        }
    }
}
