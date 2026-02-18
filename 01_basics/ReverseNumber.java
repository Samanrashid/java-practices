// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number for reverse");
        int num = scanner.nextInt();
        int reversedNum = 0;
        int remainder;
         while (num != 0) {
            // Extract the last digit (remainder)
            remainder = num % 10; //123%10 remainer 3  then 2 then 1 

            // Build the reversed number
            reversedNum = reversedNum * 10 + remainder;

            // Remove the last digit from the original number
            num /= 10;
        }
       System.out.println("Reversed Number: " + reversedNum);
        
        
    }
}
//123 ,while n < 0 