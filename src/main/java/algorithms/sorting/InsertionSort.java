package algorithms.sorting;

/**
 *  Insertion sort
 *  Time Complexity -> Worst case = O(n^2), Best case (already sorted list) = O(n)
 */
public class InsertionSort {
    public void sort (int[] input) {
        for (int i = 1; i < input.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (input[j] > input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                } else break;
            }
        }
    }

    // Alternate method with half the number of swaps
    public void sortWithLessSwaps (int[] input) {
        for (int i = 1; i < input.length; i++) {
            int curNum = input[i];
            int j = i-1;
            while (j >= 0 && curNum < input[j]) {
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = curNum;
        }
    }
}
