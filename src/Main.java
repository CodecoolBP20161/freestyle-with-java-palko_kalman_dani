import classes.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Default", 21, 3);
        player1.setName();
        TextReader text = new TextReader();

        text.read("story/0");
        switch (player1.choice()) {
            case 'A': text.read("story/1");
                System.exit(0);
            case 'B': text.read("story/2");
                break;
        }


        switch (player1.choice()) {
            case 'A':
                Monster z1 = new BloodMouse("Adam, the zombie");

                Combat kitchen = new Combat();
                System.out.println(kitchen.fight(player1, z1));
                text.read("story/3");
                break;
            case 'B': text.read("story/4");
                System.exit(0);
        }

        switch (player1.choice()) {
            case 'A': text.read("story/5");
                System.exit(0);
            case 'B': text.read("story/6");
                break;
        }

        switch (player1.choice()) {
            case 'A': text.read("story/7");
                System.exit(0);
            case 'B': text.read("story/8");
                break;
        }

        switch (player1.choice()) {
            case 'A': text.read("story/9");
                break;
            case 'B': text.read("story/10");
                System.exit(0);
        }

        switch (player1.choice()) {
            case 'A': text.read("story/11");
                System.exit(0);
            case 'B': text.read("story/12");
                break;
        }

        switch (player1.choice()) {
            case 'A': text.read("story/13");
                break;
            case 'B': text.read("story/14");
                System.exit(0);
        }

        switch (player1.choice()) {
            case 'A': text.read("story/15");
                System.exit(0);
            case 'B': text.read("story/16");
                break;
        }
    }
}
