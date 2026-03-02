import java.util.Scanner;

public class NumberTypeCheck {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter number");
    int n = s.nextInt();
    if(n>0 && n%2==0)
    {
      System.out.println("Positive Even");
    }
    else if(n%2!=0 && n>0)
    {
      System.out.println("positive Odd");
    }
    else if(n<0)
    {
      System.out.println("Negative");
    }
    else{
      System.out.println("Zero");
    }
  }
}
