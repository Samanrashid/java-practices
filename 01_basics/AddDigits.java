import java.util.Scanner;

public class AddDigits{
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("enter number for finding addittion of digits in given number");
        int num = scanner.nextInt();
        int sum = 0;
        int remainder;
        while(num!=0)
        {
            remainder = num%10; //121%10 =21
            sum = sum + remainder;
            num = num/10;
            
        }
        System.out.println("sum of digits in given number is "+sum);
       
        
  }
}