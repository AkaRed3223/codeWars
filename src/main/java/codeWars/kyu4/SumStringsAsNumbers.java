package codeWars.kyu4;

/*
 * 4 kyu - Sum Strings as Numbers
 *
 * https://www.codewars.com/kata/5324945e2ece5e1f32000370
 *
 * Given the string representations of two integers, return the string representation of the sum of those integers.
 *
 * For example:
 *
 * sumStrings('1','2') // => '3'
 *
 * A string representation of an integer will contain no characters besides the ten numerals "0" to "9".
 * I have removed the use of BigInteger and BigDecimal in java
 *
 */

public class SumStringsAsNumbers {

    private static String solve(String a, String b) {

        StringBuilder result = new StringBuilder();

        a = "0".repeat(b.length() < a.length() ? 0 : b.length() - a.length()) + a;
        b = "0".repeat(a.length() < b.length() ? 0 : a.length() - b.length()) + b;

        int remainder = 0;

        for (long i = a.length() - 1; i >= 0; i--) {
            int x = Integer.parseInt(String.valueOf(a.charAt((int) i)));
            int y = Integer.parseInt(String.valueOf(b.charAt((int) i)));

            int n = x + y;

            n += remainder;
            remainder = n / 10;

            result.insert(0, n % 10);
        }

        result = new StringBuilder(remainder == 0 ? result.toString() : remainder + result.toString());

        if (result.toString().startsWith("0")) {
            result = new StringBuilder(result.substring(1, result.length()));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("1234", "5678"));
    }
}