package algorithms.sorting;

public class QuickSort {

    public void sort (int[] input) {
        quickSort(input, 0, input.length-1);
    }

    private int findPivot (int[] input, int left, int right) {
        int pivotVal = input[right];
        int pivot = left;
        int i = left;

        while (i < right) {
            if (input[i] < pivotVal) {
                int temp = input[i];
                input[i] = input[pivot];
                input[pivot] = temp;
                pivot++;
            }
            i++;
        }
        input[right] = input[pivot];
        input[pivot] = pivotVal;
        return pivot;
    }

    private void quickSort (int[] input, int left, int right) {
        if (left >= right) return;

        int pivot = findPivot(input, left, right);

        quickSort(input, left, pivot - 1);
        quickSort(input, pivot + 1, right);
    }
}
