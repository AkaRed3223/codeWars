package codeWars.kyu8;

/*
 * 8 kyu - Are you playing banjo?
 *
 * https://www.codewars.com/kata/53af2b8861023f1d88000832
 *
 * Create a function which answers the question "Are you playing banjo?".
 * If your name starts with the letter "R" or lower case "r", you are playing banjo!
 * The function takes a name as its only argument, and returns one of the following strings:
 *
 * Examples
 * name + " plays banjo"
 * name + " does not play banjo"
 *
 * Names given are always valid strings.
 *
 */

public class AreYouPlayingBanjo {

    public static String areYouPlayingBanjo(String name) {
        return new StringBuilder(name).substring(0, 1).equalsIgnoreCase("R")
                ? name + " plays banjo"
                : name + " does not play banjo";
    }

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Cesar"));
    }
}

