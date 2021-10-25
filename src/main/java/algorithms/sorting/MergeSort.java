package algorithms.sorting;

public class MergeSort {

    public void sort (int[] input) {
        mergeSort(input,new int[input.length],  0, input.length - 1);
    }

    public static void mergeSort(int[] input, int[] temp, int l, int r) {
        if (l >= r) return;
        int mid = (l+r)/2;
        mergeSort(input, temp, l, mid);
        mergeSort(input, temp, mid+1, r);
        join(input, temp, l, r, mid);
    }

    public static void join(int[] input, int[] temp, int l, int r, int mid) {
        int i_l = l;
        int i_r = mid+1;
        int i = l;

        while (i_l <= mid && i_r <= r) {
            if (input[i_l] > input[i_r]) {
                temp[i] = input[i_r];
                i++; i_r++;
            } else if (input[i_l] < input[i_r]) {
                temp[i] = input[i_l];
                i++; i_l++;
            }
        }

        System.arraycopy(input, i_l, temp, i, mid-i_l+1);
        System.arraycopy(input, i_r, temp, i, r-i_r+1);
        System.arraycopy(temp, l, input, l, r-l+1);
    }
}
