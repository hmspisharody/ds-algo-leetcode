package algorithms.sorting;

public class SelectionSort {
    public void sort (int[] input) {
        for (int i = 0; i < input.length; i++) {
            int minIdx = i;
            int min = input[minIdx];

            for (int j = i+1; j < input.length; j++) {
                if (input[j] < min) {
                    minIdx = j;
                    min = input[minIdx];
                }
            }

            int temp = input[i];
            input[i] = min;
            input[minIdx] = temp;
        }
    }
}
