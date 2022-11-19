package leetCode.easy;

public class UglyNumber {

    //Time complexity -> O(log(n)) pois essa é a complexidade maxima de uma divisão entre x e y
    //Space complexity -> O(1) pois não está utilizando espaço extra

    private static boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        for (int factor : new int[]{2, 3, 5}) {
            n = keepDividingWhenDivisible(n, factor);
        }

        return n == 1;
    }

    private static int keepDividingWhenDivisible(int dividend, int divisor) {
        while (dividend % divisor == 0) {
            dividend /= divisor;
        }
        return dividend;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(626));
    }
}
