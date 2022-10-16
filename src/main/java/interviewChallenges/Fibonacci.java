package interviewChallenges;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        int loops = 15;

        int a = 1;
        int b = 0;
        int aux;

        int[] fibo = new int[loops];
        for (int i = 0; i < loops; i++) {
            fibo[i] = a;
            aux = a;
            a = a + b;
            b = aux;
        }
        System.out.println(Arrays.toString(fibo));
    }
}