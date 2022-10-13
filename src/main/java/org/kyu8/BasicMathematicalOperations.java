package org.kyu8;

/*
 * 8 kyu - Basic Mathematical Operations
 *
 * https://www.codewars.com/kata/57356c55867b9b7a60000bd7
 *
 * Your task is to create a function that does four basic mathematical operations.
 *
 * The function should take three arguments - operation(string/char), value1(number), value2(number).
 * The function should return result of numbers after applying the chosen operation.
 *
 * Examples(Operator, value1, value2) --> output
 * ('+', 4, 7) --> 11
 * ('-', 15, 18) --> -3
 * ('*', 5, 5) --> 25
 * ('/', 49, 7) --> 7
 *
 */

public class BasicMathematicalOperations {

    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> throw new ArithmeticException("Unrecognized arithmetic operation");
        };
    }

    public static void main(String[] args) {
        System.out.println(basicMath("*", 5, 3));
    }
}

