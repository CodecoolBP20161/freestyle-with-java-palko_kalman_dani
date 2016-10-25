package classes;

public class Combat {
    public String fight(Player player, Monster monster){
        int playerHealth = player.getHealth();
        int playerDamage = player.getDamagePerHit();
        int monsterHealth = monster.getHealth();
        int monsterDamage = monster.getDamagePerHit();
        String winText = "The winner is ";
        System.out.println("FIGHTING ZONE");
        for (int i=1;i>0;i++) {
            System.out.println(player.getName()+" health: "+playerHealth);
            System.out.println(monster.getName()+" health: "+monsterHealth+"\n");
            if ((monsterHealth -= playerDamage) <= 0) return winText+player.getName();
            if ((playerHealth -= monsterDamage) <= 0) return winText+monster.getName();
            System.out.println("ROUND: "+i+"\n"+"--------");
        }
        return null;
    }
}