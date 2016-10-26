package classes;

public class GameEngine {
    //we need one Player and one TextReader
    private Player player;
    private TextReader text;


    public GameEngine (Player player, TextReader text) {
        this.player = player;
        this.text = text;
    }


    //this is the method we use at the cases when there is no fight in the story
    //if you die at 'A' or at 'B' depends on the second boolean argument of the method
    public void run(int page1, boolean arg) {
        try
        {
            switch (this.player.choice()) {
                case 'A':
                    //if you need info about this reading method, look at the TextReader class
                    this.text.read(page1);
                    if(arg){System.exit(0);}
                    else {break;}
                case 'B':
                    this.text.read(page1+1);
                    if(arg){break;}
                    else {System.exit(0);}
            }
        //for more info look at the Players choice method
        } catch (StupidUserError e) {
            e.printStackTrace();
            System.exit(0);
        }
    }


    //this is the method we use at the chapters when there is fight in the story
    //it's mostly the same as the first method, except one line...
    //...we can't solve the problem of using optional  arguments in java
    public void run(int page1, boolean arg, Combat combat, Player player, Monster monster) {
        try
        {
            switch (this.player.choice()) {
                case 'A':
                    //here runs the fight method of Combat -- details in the Combat class
                    System.out.println(combat.fight(player, monster));
                    this.text.read(page1);
                    if(arg){System.exit(0);}
                    else {break;}
                case 'B':
                    this.text.read(page1+1);
                    if(arg){break;}
                    else {System.exit(0);}
            }
        } catch (StupidUserError e) {
            e.printStackTrace();
        }
    }
}
