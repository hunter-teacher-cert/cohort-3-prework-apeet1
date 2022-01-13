public class Time {
  public static void main(String[] args) {

    int startHour = 9;
    int startMinute = 35;
    int startSecond = 23;
    
    System.out.print("My start time was ");
    System.out.print(startHour);
    System.out.print(":");
    System.out.print(startMinute);
    System.out.print(" am");
    System.out.println(".");

    System.out.print("The number of seconds since midnight was ");
    System.out.print(startHour * 3600 + startMinute * 60 + startSecond);
    System.out.println(" seconds.");

    int secondsInDay = 86400;
    System.out.print("The number of seconds remaining in the day was ");
    System.out.print(secondsInDay - (startHour * 3600 + startMinute * 60 + startSecond) );
    System.out.println(" seconds.");

    int endHour = 10;
    int endMinute = 49;
    int endSecond = 50;

    System.out.print("The current time is ");
    System.out.print(endHour);
    System.out.print(":");
    System.out.print(endMinute);
    System.out.print(" am");
    System.out.println(".");

    System.out.print("The amount of time I spent on this project was ");
    System.out.print(endHour - startHour);
    System.out.print(" hour, ");
    System.out.print(endMinute - startMinute);
    System.out.print(" minutes, and ");
    System.out.print(endSecond - startSecond);
    System.out.println(" seconds.");

  }

}