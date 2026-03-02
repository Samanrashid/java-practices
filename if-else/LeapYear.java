
import java.util.Scanner;

public class LeapYear {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Year to check if the given Year is leap or not ");
    int year = s.nextInt();
    if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) )
    {
      System.out.println("leap year");
    }
    else
    {
      System.out.println("this is not leap year");
    }
    
  }
}
