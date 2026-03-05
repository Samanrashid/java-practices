import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = s.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        int min = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Minimum element = " + min);
    }
}