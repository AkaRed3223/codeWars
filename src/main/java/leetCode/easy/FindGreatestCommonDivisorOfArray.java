package leetCode.easy;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class FindGreatestCommonDivisorOfArray {

    public static int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];
        int gcd = 1;

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr < min) {
                min = curr;
            } else {
                if (curr > max) {
                    max = curr;
                }
            }
        }

        for (int i = 1; i <= min; i++) {
            if (max % i == 0 && min % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        var response = findGCD(new int[]{123, 456, 789, 215, 658, 145});
        stopwatch.stop(); // optional
        System.out.println("Time elapsed: " + stopwatch.elapsed(TimeUnit.NANOSECONDS));
        System.out.println(response);
    }


}

