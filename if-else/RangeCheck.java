
import java.util.Scanner;

public class RangeCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number to check Range ");
    int n = sc.nextInt();
    if (n < 1) {
      System.out.println("Too small");
    } else if (n > 100) {
      System.out.println("Too large");
    } else {
      System.out.println("Valid number");
    }
  }

}
