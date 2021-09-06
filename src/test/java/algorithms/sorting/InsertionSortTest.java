package algorithms.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static testutils.TestUtils.printArray;

public class InsertionSortTest {

    private int[] inputArray = {4,2,8,5,1,6,10,7,3,9};
    private int[] testInput;

    @Before
    public void setup() {
        testInput = Arrays.copyOf(inputArray, inputArray.length);
    }

    @Test
    public void sort() {

        printArray("Before sorting: ", testInput);
        assertArrayEquals(new int[] {4,2,8,5,1,6,10,7,3,9}, testInput);

        InsertionSort sort = new InsertionSort();
        sort.sort(testInput);

        printArray("After sorting: ", testInput);
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, testInput);
    }

    @Test
    public void sortWithFlag() {
        printArray("Before sorting: ", testInput);
        assertArrayEquals(new int[] {4,2,8,5,1,6,10,7,3,9}, testInput);

        InsertionSort sort = new InsertionSort();
        sort.sortWithLessSwaps(testInput);

        printArray("After sorting: ", testInput);
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, testInput);
    }
}