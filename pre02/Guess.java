import java.util.Scanner;
import java.util.Random;

public class Guess {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(100) + 1; 

    System.out.println("I'm thinking of a number between 1 and 100 (including both.) Can you guess what it is?\nType a number:");
    
    int guess = in.nextInt();
    int error = Math.abs(number - guess);
    System.out.println("Your guess is: " + guess);
    System.out.println("The number I was thinking of is: " + number);
    System.out.println("You were off by: " + error);

  }
}
