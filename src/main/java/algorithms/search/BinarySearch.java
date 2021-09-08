package algorithms.search;

public class BinarySearch {
    public int search(int[] input, int k) {
        return search(input, 0, input.length - 1, k);
    }

    private int search(int[] input, int l, int r, int k) {
        int mid = (l + r) / 2;
        int index;
        if (k == input[mid]) {
            return mid;
        } else if (k < input[mid]) {
            index = search(input, l, mid - 1, k);
        } else {
            index = search(input, mid + 1, r, k);
        }
        return index;
    }
}
