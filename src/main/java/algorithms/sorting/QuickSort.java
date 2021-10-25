package algorithms.sorting;

public class QuickSort {

    public void sort (int[] input) {
        quickSort(input, 0, input.length-1);
    }

    private void swap(int[] input, int pivot, int i) {
        int temp = input[i];
        input[i] = input[pivot];
        input[pivot] = temp;
    }

    private void quickSort(int[] input, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = findPivot(input, start, end);
        quickSort(input, start, pivot-1);
        quickSort(input, pivot+1, end);
    }

    private int findPivot(int[] input, int start, int end) {
        int idx = start;
        int pivot = start;
        int pivotVal = input[end];

        while (idx < end) {
            if (input[idx] < pivotVal) {
                swap(input, idx, pivot);
                pivot++;
            }
            idx++;
        }

        input[end] = input[pivot];
        input[pivot] = pivotVal;

        return pivot;
    }
}
