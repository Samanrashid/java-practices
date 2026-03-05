public class SortedArray {
  public static boolean isArraySorted(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            // If the current element is greater than the next element,
            // the array is not sorted, so return false.
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        // If the loop completes without finding any unsorted pair, the array is sorted.
        return true;
    }

    public static void main(String[] args) {
        int[] sortedArr = {1, 2, 3, 4, 5};
        int[] unsortedArr = {5, 4, 6, 7, 8};

        System.out.println("Array sortedArr is sorted: " + isArraySorted(sortedArr)); // true
        System.out.println("Array unsortedArr is sorted: " + isArraySorted(unsortedArr)); // false
    }
}


