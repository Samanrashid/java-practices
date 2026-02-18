import java.util.Scanner;

public class CountDigits {
  public static void main(String[] args)
  {
     Scanner scanner = new Scanner(System.in);
        System.out.println("enter number for counting digits in given number ");
        int num = scanner.nextInt();
        int count = 0;
        int remainder;
        while(num!=0)
        {
            remainder = num%10; //121%10 =21
            num = num/10;
            count = count+1;
            
        }
        System.out.println("number os digits in given number  "+count);
       
        
  }
}