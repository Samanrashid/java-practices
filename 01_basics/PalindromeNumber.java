import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("enter number for reverse");
        int num = scanner.nextInt();
        int reversedNum = 0;
        int remainder;
        int original = num;
        while(num!=0)
        {
            remainder = num%10;
            reversedNum = reversedNum*10 + remainder;
            num = num/10;
        }
        if(original==reversedNum){
            System.out.println("num is palindrome");
        }
        else
        {
            System.out.println("num is not palindrome");
        }
       
        
        
    }
  }
  

