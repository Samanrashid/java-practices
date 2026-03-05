import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = s.nextInt();

        int[] array = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
            sum += array[i];   // adding elements while taking input
        }

        System.out.println("Sum of elements = " + sum);
    }
}