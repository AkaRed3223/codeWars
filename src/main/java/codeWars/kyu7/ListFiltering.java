package codeWars.kyu7;

/*
 * 7 kyu - List Filtering
 *
 * https://www.codewars.com/kata/53dbd5315a3c69eed20002dd
 *
 * In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
 *
 * Example
 * Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
 * Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
 * Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)
 *
 */

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(object -> object instanceof Integer).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)));
    }
}

