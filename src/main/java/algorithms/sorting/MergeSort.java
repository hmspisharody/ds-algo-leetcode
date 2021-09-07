package algorithms.sorting;

public class MergeSort {

    public void sort (int[] input) {
        mergeSort(input,new int[input.length],  0, input.length - 1);
    }

    private void mergeSort(int[] input, int[] temp, int l, int r) {
        if (r <= l) return;

        int mid = (l + r) / 2;
        mergeSort(input, temp, l, mid);
        mergeSort(input, temp,mid + 1, r);
        join(input, temp, l, r, mid);

    }

    private void join (int[] input, int[] temp, int l, int r, int mid) {
        int a_i = l, b_i = mid + 1, i = 0;

        while (a_i <= mid && b_i <= r) {
            if (input[a_i] < input[b_i]) {
                temp[i] = input[a_i];
                a_i++;
            } else {
                temp[i] = input[b_i];
                b_i++;
            }
            i++;
        }

        while (a_i <= mid) {
            temp[i] = input[a_i];
            a_i++; i++;
        }

        while (b_i <= r) {
            temp[i] = input[b_i];
            b_i++; i++;
        }

        for (int j = l; j < l + temp.length; j++) {
            input[j] = temp[j-l];
        }
    }
}
