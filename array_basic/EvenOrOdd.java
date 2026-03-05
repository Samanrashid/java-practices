import java.util.Scanner;

public class EvenOrOdd {
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of array");
        for(int i = 0;i<arr.length;i++)
        {
          arr[i] = s.nextInt();
        }
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0)
            {
              countEven = countEven + 1;
            }
            else {
              countOdd+=1;
            }
        }
        System.out.println("count of even: " + countEven + " count of odd " + countOdd);

      } 
}
