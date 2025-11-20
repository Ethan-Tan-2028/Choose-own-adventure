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
       //int health = 10;
      // int damagephysical = 1;
       //int damagemagical = 4; 
    }
    if (characterclass.equals("Fighter")) {
      System.out.println("Wonderful!");
      //int health = 20;
     // int damagephysical = 6;

    }
    if (characterclass.equals("Rouge")){
      System.out.println("Wonderful!");
      //int health = 15; 
      //int damagephysical = 7;

     }
        
    
  
  
    ///////////////////////////
    
   System.out.println("You find yourself in a packed bar, with a drink in hand. What would you like to do?");
   System.out.println("Talk to Bartender, Find a Suspicious Person, Start a Fight");
    String descision = scanner.nextLine(); 
    if (descision.equals("Talk to Bartender")){
         System.out.println("Bartender: Hello, my name is Adrian. How may I help you today");
         System.out.println("|I want a drink| |Nevermind|");
         String bartenderdecision = scanner.nextLine();
         if (bartenderdecision.equals("I want a drink")){
            System.out.println("Bartender: Here try this.");
            System.out.println("You were poisioned. Unfortunate");
         }
          if (bartenderdecision.equals("Nevermind")){
            System.out.println("Bartender: Very well then.");
            System.out.println("Talk to Bartender, Find a Suspicious Person");
          }
// Offer drink maybe poision. 
    }
    String descision2 = scanner.nextLine();

    if (descision.equals("Find a Suspicious Person")||descision2.equals("Find a Suspicious Person")){
      int suspicioushealth = 2; 
      System.out.println("You find a man leaning in a corner of the bar. He seems to be aurafarming.");
      System.out.println("|Pick a Fight| |Mind Your Buisness|");
      String Susdescision = scanner.nextLine(); 
      if (Susdescision.equals("Pick a Fight")){

      }
      if (Susdescision.equals("Mind Your Buisness")){
        System.out.println("He picks a fight with you. What would you like to do: ");
        if (characterclass.equals("Wizard")){
          System.out.println("Punch or Magic");
          String attacktype = scanner.nextLine();
          if (attacktype.equals("Magic")){
            System.out.println("You hit him with a blast of magic, killing him. This caught everyones attention and you were arrested and sent to life in prision. Unfortunate.");
          }
          if (attacktype.equals("Punch")){
            System.out.println("You took a swing and a miss, the man uses this oppertunity to beat the daylights out of you. You are sent to the hospital with fatal injuries. Unfortunate");
          }

        }
        else{
          System.out.println ("Attack?");
          String attacktypeRF = scanner.nextLine(); 
          if (attacktypeRF.equals("Magic")){
            System.out.println("You hit him with a blast of magic, killing him. This caught everyones attention and you were arrested and sent to life in prision. Unfortunate.");
          }
        }
      }
    }






  }
}





