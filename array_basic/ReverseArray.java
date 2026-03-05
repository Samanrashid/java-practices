
import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter size of array");
    int n = s.nextInt();
    int[] arr = new int[n];
    System.out.println("enter elements of array");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
    for (int i = arr.length-1;i>=0;i--)
    {
      System.out.println(arr[i]);
    }
  }
  
}
