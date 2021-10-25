import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {

    public static void main(String[] args) {
        String s = "   -42";

        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        int solution = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        boolean negative = false;
        int power = s.length()-1;

        for (char c : s.toCharArray()) {
            if (c == '-') {
                negative = true;
            } else {
                int curDigit = getPower(10, power) * ((int)c - (int)'0');

                if (curDigit + solution > max) {
                    if (negative == false) return max;
                    else return min;
                }

                solution = solution + curDigit;

            }

            power--;

        }

        return solution;

    }

    public static int getPower(int x, int a) {
        int pow = 1;

        while (a > 0) {
            pow = pow * 10;
            a--;
        }

        return pow;
    }
}