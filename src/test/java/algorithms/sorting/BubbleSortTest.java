package algorithms.sorting;

class BubbleSortTest {

    public static void main(String[] args) {
        int[] testInput = {4,2,8,5,1,6,19,7,3,9};
        printArray("Before sorting: ", testInput);

        BubbleSort bubbleSort= new BubbleSort();
        bubbleSort.sort(testInput);
        printArray("After sorting: ", testInput);
    }

    public static void printArray (String prefixString, int[] input) {
        System.out.print(prefixString);
        for (int n : input) System.out.print(n + " ");
        System.out.println("");
    }
}