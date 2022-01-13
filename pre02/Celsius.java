import java.util.Scanner;

public class Celsius {
  public static void main(String[] args) {

int Celsius;
double Fahrenheit;
Scanner in = new Scanner(System.in);

System.out.println("How many degrees Celsius? ");

Celsius = in.nextInt();
Fahrenheit = Celsius * 9.0 / 5.0 + 32;
System.out.print(Celsius + " degrees Celsius = ");
System.out.println(Fahrenheit + " degrees Fahrenheit");

//I'm wondering if you can use a degrees symbol

  }
}  

    