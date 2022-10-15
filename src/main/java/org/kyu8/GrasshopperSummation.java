package org.kyu8;

/*
 * 8 kyu - Grasshopper - Summation
 *
 * https://www.codewars.com/kata/55d24f55d7dd296eb9000030
 *
 * Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
 *
 * For example:
 *
 * summation(2) -> 3
 * 1 + 2
 * summation(8) -> 36
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 *
 */

import java.util.stream.IntStream;

public class GrasshopperSummation {

    public static int summation(int n) {
       return IntStream.rangeClosed(1, n).sum();
    }

    public static void main(String[] args) {
        System.out.println(summation(8));
    }
}

