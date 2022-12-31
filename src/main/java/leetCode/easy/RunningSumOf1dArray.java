package leetCode.easy;

public class RunningSumOf1dArray {

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i];
            result[i] = temp;
        }
        return result;
    }
}