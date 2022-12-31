package leetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    public static int numIdenticalPairs1(int[] nums) {
        //O(n)
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            res += map.get(n) - 1;
        }
        return res;
    }

    public static int numIdenticalPairs2(int[] nums) {
        //O(n^2)
        int size = nums.length;
        int count = 0;

        for(int i = 0; i < size; i++) {
            for(int j = i+1; j < size; j++) {
                if(nums[i] == nums[j] && i < j) count++;
            }
        }
        return count;
    }
}
