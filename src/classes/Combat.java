package classes;

public class Combat {
    public String fight(Player player, Monster monster){
        //getting the objects attributes
        int playerHealth = player.getHealth();
        int playerDamage = player.getDamagePerHit();
        int monsterHealth = monster.getHealth();
        int monsterDamage = monster.getDamagePerHit();
        String winText = "\nThe winner is ";
        System.out.println("FIGHTING ZONE");
//        this is the fighting zone - the loop runs until one of the fighters health goes equal or under 0
        for (int i=1;i>0;i++) {
            System.out.println(player.getName()+" health: "+playerHealth);
            System.out.println(monster.getName()+" health: "+monsterHealth+"\n");
            if ((monsterHealth -= playerDamage) <= 0) return winText+player.getName();
            if ((playerHealth -= monsterDamage) <= 0) return winText+monster.getName();
            System.out.println("ROUND: "+i+"\n"+"--------");
        }
//        if something wrong happens, we return null(but it's almost impossible)
//        (however this case handled in GameEngine for safety's sake
        return null;
    }
}