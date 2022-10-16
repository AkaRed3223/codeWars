package codeWars.kyu8;

/*
 * 8 kyu - Calculate average
 *
 * https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/
 *
 * Write a function which calculates the average of the numbers in a given list
 *
 * Note: Empty arrays should return 0
 *
 */

import java.util.Arrays;

public class CalculateAverage {

    public static double find_average(int[] array) {
        if (array.length == 0) return 0;
        return Arrays.stream(array).sum() / (double) array.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(find_average(array));
    }
}

