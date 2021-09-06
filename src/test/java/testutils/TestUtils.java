package testutils;

public class TestUtils {
    public static void printArray (String prefixString, int[] input) {
        System.out.print(prefixString);
        for (int n : input) System.out.print(n + " ");
        System.out.println("");
    }
}
