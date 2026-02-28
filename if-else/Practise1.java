
import java.util.Scanner;

public class Practise1 {
  
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.err.println("Please enter num1");
      int num1 = scanner.nextInt();
      System.err.println("Please enter num2");
      int num2 = scanner.nextInt();
      int addition = num1 + num2;
      int subs = num1-num2;
      int multiplication = num1*num2;
      if(num2 == 0) {
    System.out.println("Division not possible");
} else {
    int division = num1 / num2;
    System.out.println("Division is " + division);
}
      System.err.println("Addittion is " + addition + "subs is " + subs + "multiplication is " + multiplication);
    }
}
