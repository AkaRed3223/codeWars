package codeWars.kyu8;

/*
 * 8 kyu - Even or Odd
 *
 * https://www.codewars.com/kata/53da3dbb4a5168369a0000fe
 *
 * Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 *
 */

public class EvenOrOdd {

    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(even_or_odd(1236));
    }
}

