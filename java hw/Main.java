import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello Traveler, What Is Your Name?: ");
    String name = scanner.nextLine();
    System.out.println(name +", A Fine Name");

    System.out.println("What Class Will You Choose: Wizard, Fighter, or Rouge");
    String characterclass = scanner.nextLine();

    if (characterclass.equals("Wizard")){
       System.out.println("Wonderful!");
       int health = 10;
       int damagephysical = 1;
       int damagemagical = 4; 
    }
    if (characterclass.equals("Fighter")) {
      System.out.println("Wonderful!");
      int health = 20;
      int damagephysical = 6;

    }
    if (characterclass.equals("Rouge")){
      System.out.println("Wonderful!");
      int health = 15; 
      int damagephysical = 7;

     }
        
    
  
  
    ///////////////////////////
    
   System.out.println("You find yourself in a packed bar, with a drink in hand. What would you like to do?");
   System.out.println("Talk to Bartender, Find a Suspicious Person, Start a Fight");







  }
}





