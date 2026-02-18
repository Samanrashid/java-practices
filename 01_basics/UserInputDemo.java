import java.util.Scanner;
public class UserInputDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter name: ");
    String name = scanner.nextLine();
    System.out.println("name is : " + name);
  }
  
}
