import classes.*;

public class Main {
    public static void main(String[] args) {

//        TextReader test = new TextReader();
//        int num = 1;
//        test.read("text/test"+num+".txt");

        Player player1 = new Player("Bob", 10, 5);
//        player1.setName();
//        System.out.println(player1.getName());

        Monster m1 = new BloodMouse("Charlie");

        Combat kitchen = new Combat();
        System.out.println(kitchen.fight(player1, m1));
    }
}
