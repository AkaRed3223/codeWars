package leetCode.easy;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {

        int sum = 0;
        int leftSum = 0;

        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}