public class Date {
  public static void main(String[] args) {
    
    String day = "Thursday";
    int date = 13;
    String month = "January ";
    int year = 2022;

    System.out.println("American format:");
    System.out.print(day);
    System.out.print(", ");
    System.out.print(month);
    System.out.print(date);
    System.out.print(", ");
    System.out.println(year);

    System.out.println("European format:");
    System.out.print(day);
    System.out.print(" ");
    System.out.print(date);
    System.out.print(" ");
    System.out.print(month);
    System.out.println(year);
  }
}