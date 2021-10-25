package algorithms.search;

public class BinarySearch {
    public int search (int[] input, int k) {
        return search(input, 0, input.length - 1, k);
    }

    public int search(int[] input, int lIdx, int rIdx, int find) {
        if (lIdx > rIdx) return -1;

        int mid = (lIdx + rIdx)/2;

        if (input[mid] == find) return mid;
        else if (input[mid] > find) {
            return search(input, lIdx, mid-1, find);
        } else {
            return search(input, mid+1, rIdx, find);
        }
    }
}
