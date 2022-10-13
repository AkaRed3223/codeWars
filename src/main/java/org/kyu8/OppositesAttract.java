package org.kyu8;

/**
 * 8 kyu - Opposites Attract
 * <p>
 * <a href="https://www.codewars.com/kata/555086d53eac039a2a000083">...</a>
 * <p>
 * Details:
 * <p>
 * Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
 * If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
 * <p>
 * Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
 */

public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        return isPair(flower1) != isPair(flower2);
    }

    private static boolean isPair(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isLove(4, 3));
    }

}
