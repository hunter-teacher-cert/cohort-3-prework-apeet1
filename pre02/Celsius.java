import java.util.Scanner;

public class Celsius { 
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    // prompt user for temperture input
    System.out.println("Enter a temperature in degrees Celsius: ");
    double Cels;
    Cels = in.nextDouble();
    
    // convert C to F and output
    double Fahr = Cels * 9/5 + 32; 
    System.out.printf("%.1f C = %.1f F\n", Cels, Fahr);
  }
}
 