import java.util.Scanner;

public class EvenOddMethod {
  static void Even(int num)
    {
       
            if(num%2==0)
            {
                System.out.println("true");
            }
        
    }
    static void Odd(int num)
    {
        if(num%2!=0)
        {
             System.out.println("false");
        }
    }
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check even or odd");
        int num = scanner.nextInt();
        Even(num);
        Odd(num);
    
  }
  
}
