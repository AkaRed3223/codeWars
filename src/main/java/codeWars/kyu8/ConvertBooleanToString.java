package codeWars.kyu8;

/*
 * 8 kyu - Convert a Boolean to String
 *
 * https://www.codewars.com/kata/551b4501ac0447318f0009cd
 *
 * Implement a function which convert the given boolean value into its string representation.
 *
 * Note: Only valid inputs will be given.
 *
 */

public class ConvertBooleanToString {

    public static String convert(boolean b) {
        return Boolean.toString(b);
    }

    public static void main(String[] args) {
        System.out.println(convert(false));
    }
}

