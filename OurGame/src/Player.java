import java.util.*;

public class Player {
    String name = null;
    int health = 10;
    int damagePerHit = 0;


    public  void setName() {
      System.out.println("Enter your name");
      Scanner nameInput = new Scanner( System.in );
      String name = nameInput.nextLine();
      this.name = name;
  }
}
