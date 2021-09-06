package algorithms.sorting;

/**
 *  Bubble sort
 *  Time Complexity -> O(n^2)
 */
public class BubbleSort {
    public void sort(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    // Alternate implementation with sorted flag
    public void sortWithFlag(int[] array) {
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
