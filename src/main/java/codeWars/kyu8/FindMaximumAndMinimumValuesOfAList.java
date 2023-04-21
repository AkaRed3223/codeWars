package codeWars.kyu8;

public class FindMaximumAndMinimumValuesOfAList {

    public int min(int[] list) {
        int min = list[0];
        for (int curr : list) {
            min = Math.min(curr, min);
        }
        return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for (int curr : list) {
            max = Math.max(curr, max);
        }
        return max;
    }
}
