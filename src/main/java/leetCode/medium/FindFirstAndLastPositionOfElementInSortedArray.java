package leetCode.medium;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

    public static int[] searchRange(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int leftBoundary = binarySearch(nums, 0, nums.length - 1, -1, true, target);
        int rightBoundary = binarySearch(nums, 0, nums.length - 1, -1, false, target);

        return new int[]{leftBoundary, rightBoundary};
    }

    private static int binarySearch(int[] array, int start, int end, int lastSeen, boolean left, int target) {
        if (start > end) {
            return lastSeen;
        }

        int mid = (start + end) / 2;

        if (array[mid] == target) {
            lastSeen = mid;
        }

        if (target < array[mid] || (target == array[mid] && left)) {
            return binarySearch(array, start, mid - 1, lastSeen, left, target);
        } else {
            return binarySearch(array, mid + 1, end, lastSeen, left, target);
        }
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1, 2, 3, 4, 5}, 2)));
    }
}