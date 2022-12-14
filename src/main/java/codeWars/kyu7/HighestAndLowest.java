package codeWars.kyu7;

/*
 * 7 kyu - Highest and Lowest
 *
 * https://www.codewars.com/kata/554b4ac871d6813a03000035
 *
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 *
 * Examples
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 *
 * Notes
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 *
 */

import java.util.Arrays;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {

        //var stats = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();

        int[] intArray = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();

        var min = Arrays.stream(intArray).min().getAsInt();
        var max = Arrays.stream(intArray).max().getAsInt();

        return max + " " + min;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}

