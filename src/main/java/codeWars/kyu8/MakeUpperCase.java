package codeWars.kyu8;

/*
 * 8 kyu - Make Upper Case
 *
 * https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7
 *
 * Write a function which converts the input string to uppercase.
 *
 */

public class MakeUpperCase {

    public static String makeUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(makeUpperCase("hello"));
    }
}

