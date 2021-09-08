package algorithms.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void search() {
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, input);

        BinarySearch search = new BinarySearch();
        int i = search.search(input, 6);
        System.out.println("Index of 6: " + i);

        assertEquals(5, i);
    }
}