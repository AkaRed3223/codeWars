package codeWars.kyu7;

/*
 * 7 kyu - Shortest Word
 *
 * https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
 *
 * Simple, given a string of words, return the length of the shortest word(s).
 *
 * String will never be empty and you do not need to account for different data types.
 *
 */

import java.util.Arrays;

public class ShortestWord {

    public static int findShort(String s) {
        // the regex "\\s+" removes all spaces between words
        return Arrays.stream(s.split("\\s+"))
                .mapToInt(String::length)
                .min()
                .orElse(-1);
    }

    public static void main(String[] args) {
        System.out.println(findShort("String  will never bee empty and you doa not need toa account for different data types"));
    }
}

