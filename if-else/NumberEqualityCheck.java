//Question to check if given three numbers are same , two same or distinct
import java.util.Scanner;
public class NumberEqualityCheck {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter num1 ,num2 and num3");
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    int num3 = s.nextInt();
    if(num1==num2 && num2==num3)
    {
      System.out.println("All numbers are equal");
    }
    else if(num1==num2 || num2==num3 || num1==num3)
    {
      System.out.println("two numbers are same");
    }
    else {
      System.out.println("All three numbers are different");
    }
  }
}
