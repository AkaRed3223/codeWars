package org.kyu8;

/*
 * 8 kyu - Reversed Strings
 *
 * https://www.codewars.com/kata/5168bb5dfe9a00b126000018
 *
 * Complete the solution so that it reverses the string passed into it.
 *
 * For example:
 * 'world'  =>  'dlrow'
 * 'word'   =>  'drow'
 *
 */

import java.util.stream.IntStream;

public class ReversedStrings {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
        //StringBuffer has the same functionality, but it is multithreaded
    }

    public static void main(String[] args) {
        System.out.println(solution("world"));
    }
}

