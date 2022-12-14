package leetCode.easy;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}
