package classes;
import java.util.Scanner;

public class Player {
    private String name;
    private int health;
    private int damagePerHit;

    public Player(String name, int health, int damagePerHit) {
        this.name = name;
        this.health = health;
        this.damagePerHit = damagePerHit;
    }

    public String getName() {
        return name;
    }


    //setup the players name what we got from the user-input
    public void setName() {
        System.out.println("Enter your name: ");
        Scanner nameInput = new Scanner( System.in );
        String name = nameInput.nextLine();
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

    //The user can choose the option 'A' or 'B' by typing these letters.
    //Any other cases an error raised(for more info look at the StupidUserError class)
    public Character choice() throws StupidUserError {
        System.out.println("\nEnter your choice (A or B)!\n(letter size doesn't matter)");
        Scanner choiceInput = new Scanner( System.in );
        Character choice = choiceInput.next().charAt(0);
        //the letter-size doesn't matter
        choice = Character.toUpperCase(choice);
        if ((choice!='A')&&(choice!='B')) {
            throw new StupidUserError("Game over, dude!");
        }
        return choice;
    }
}
