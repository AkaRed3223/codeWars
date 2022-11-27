package leetCode.easy;

public class SmallestEvenMultiple {

    public static int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : 2 * n;
    }

    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
    }
}