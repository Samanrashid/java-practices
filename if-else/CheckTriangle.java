
import java.util.Scanner;

public class CheckTriangle {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter number to check if it is Triangle");
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    if(a > 0 && b > 0 && c > 0 &&
   a + b > c &&
   a + c > b &&
   b + c > a) 
   {

    System.out.println("Valid Triangle");
} 
else {
    System.out.println("Invalid Triangle");
}
  }
}
