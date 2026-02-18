import java.util.Scanner;

public class AddNumbersMethod {
  static int Sum(int a ,int b)
    {
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first Number");
        int a = sc.nextInt();
        System.out.println("enter second Number");
        int b = sc.nextInt();
        System.out.println("Sum is : " + Sum(a,b));
    }
}
