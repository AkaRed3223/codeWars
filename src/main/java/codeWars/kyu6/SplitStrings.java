package codeWars.kyu6;

/*
 * 6 kyu - Split Strings
 *
 * https://www.codewars.com/kata/515de9ae9dcfc28eb6000001
 *
 * Complete the solution so that it splits the string into pairs of two characters.
 *  If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
 *
 * Examples:
 * 'abc' =>  ['ab', 'c_']
 * 'abcdef' => ['ab', 'cd', 'ef']
 *
 */

import java.util.Arrays;

public class SplitStrings {

    public static String[] solution(String s) {
        s = (s.length() % 2 == 0) ? s : s + "_";
        return s.split("(?<=\\G.{2})");
    }

    public static void main(String[] args) {
        var solution = solution("aabbc");
        System.out.println(Arrays.toString(solution));
    }
}

