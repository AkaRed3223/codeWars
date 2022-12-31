package leetCode.easy;

public class PartitionIntoDeciBinaryNumbers {

    public static int minPartitions(String n) {
        int finalNum = 0;
        char[] arr = n.toCharArray();
        for (char c : arr) {
            var num = Integer.parseInt(String.valueOf(c));
            if (num > finalNum) finalNum = num;
        }
        return finalNum;
    }
}
