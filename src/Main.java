import classes.*;

public class Main {
    public static void main(String[] args) {
        //initializing the game
        //if you need more info of something, look at the class with its name
        Player player = new Player(null, 9, 3);
        player.setName();
        Monster zombie = new Zombie("Adam, the zombie");
        Monster bloodMouse = new BloodMouse("Charlie, the blood-mouse");
        Combat office = new Combat();
        Combat kitchen = new Combat();
        TextReader text = new TextReader(1);
        text.read(0);
        GameEngine chapter1 = new GameEngine(player, text);

        //here is the story-line
        chapter1.run(1, true);

        chapter1.runCombat(3, false, office, player, zombie);

        chapter1.run(5, true);

        chapter1.run(7, true);

        chapter1.run(9, false);

        chapter1.run(11, true);

        chapter1.run(13, false);

        chapter1.runCombat(15, true, kitchen, player, bloodMouse);
    }
}
