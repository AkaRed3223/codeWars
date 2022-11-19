package codeWars.kyu5;

/*
 * 5 kyu - RGB to Hex conversion
 *
 * https://www.codewars.com/kata/513e08acc600c94f01000001
 *
 * The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned.
 * Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.
 *
 * Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
 *
 * The following are examples of expected output values:
 *
 * RgbToHex.rgb(255, 255, 255) // returns FFFFFF
 * RgbToHex.rgb(255, 255, 300) // returns FFFFFF
 * RgbToHex.rgb(0, 0, 0)       // returns 000000
 * RgbToHex.rgb(148, 0, 211)   // returns 9400D3
 *
 */

public class RgbToHexConversion {

    public static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X", adjustInteger(r), adjustInteger(g), adjustInteger(b));
    }

    private static int adjustInteger(int i) {
        if (i < 0) return 0;
        return Math.min(i, 255);
    }

    public static void main(String[] args) {
        System.out.println(rgb(15, 15, 15));
    }
}

