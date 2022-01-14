import java.util.Random;

public class Guess {
  public static void main(String[] args) {
    //pick a random number
    
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    System.out.println(number);

    System.out.println("I'm thinking of a number between 1 and 100 (including both.) Can you guess what it is?");
    System.out.println("Type a number: ");
    line = in.nextLine();
    System.out.println("Your guess is: " + line);

  }
}
