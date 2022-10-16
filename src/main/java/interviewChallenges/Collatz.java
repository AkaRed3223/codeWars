package interviewChallenges;

import java.util.ArrayList;
import java.util.List;

public class Collatz {

    private static List<Long> getCollatz(long num) {

        List<Long> numbers = new ArrayList<>();
        while (num != 1) {
            if (num % 2 == 0) num = num / 2;
            else num = num * 3 + 1;
            numbers.add(num);
        }
        return numbers;
    }

    public static void main(String[] args) {

        long number = 152154531231212L;

        List<Long> collatzList = getCollatz(number);
        System.out.printf("Number of iterations: %d%n", collatzList.size());
        System.out.println(collatzList);
    }
}