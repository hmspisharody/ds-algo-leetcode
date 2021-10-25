package algorithms.sorting;

public class SelectionSort {

    public void sort (int[] input) {

        for (int i=0; i<input.length-1; i++) {
            int minIdx = i;

            for (int j=i+1; j<input.length; j++) {
                if (input[j] < input[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = input[i];
            input[i] = input[minIdx];
            input[minIdx] = temp;

        }
    }
}
