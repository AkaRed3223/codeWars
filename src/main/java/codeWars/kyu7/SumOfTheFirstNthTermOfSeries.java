package codeWars.kyu7;

/*
 * 7 kyu - Sum of the first nth term of Series
 *
 * https://www.codewars.com/kata/555eded1ad94b00403000071
 *
 * Your task is to write a function which returns the sum of following series up to the nth term(parameter).
 * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 *
 * Rules:
 * You need to round the answer to 2 decimal places and return it as String.
 * If the given value is 0 then it should return 0.00
 * You will only be given Natural Numbers as arguments.
 *
 * Examples:(Input --> Output)
 * 1 --> 1 --> "1.00"
 * 2 --> 1 + 1/4 --> "1.25"
 * 5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
 *
 */

import java.util.Locale;
import java.util.stream.IntStream;

public class SumOfTheFirstNthTermOfSeries {

    public static String seriesSum(int n) {
        return String.format(
                Locale.US,
                "%.2f",
                IntStream.range(0, n)
                        .mapToDouble(num -> 1.0 / (1 + num * 3))
                        .sum());
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}

