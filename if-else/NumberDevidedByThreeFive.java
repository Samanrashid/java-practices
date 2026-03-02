
import java.util.Scanner;

public class NumberDevidedByThreeFive{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter number to check if is divided by 3 and 5");
    int num = sc.nextInt();
    if(num%3==0 && num%5==0)
    {
      System.out.println("Number"+ num + " is divided by both 3 and 5");
    }
    else if(num%3==0)
    {
      System.out.println("Number"+ num + " is divided by 3");
    }
    else if(num%5==0)
    {
      System.out.println("Number"+ num + " is divided by 5");
    }
    else
    {
      System.out.println("Number"+ num + " is neither divided by 3 nor 5");
    }
  
    
  }
}