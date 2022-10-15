package org.kyu5;

/*
 * 5 kyu - Human Readable Time
 *
 * https://www.codewars.com/kata/52685f7382004e774f0001f7
 *
 * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
 *
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 *
 * The maximum time never exceeds 359999 (99:59:59)
 *
*/

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        int hh = seconds / 3600;
        int mm = (seconds % 3600) / 60;
        int ss = seconds % 60;
        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(86399));
    }
}

