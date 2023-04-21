package codeWars.kyu6;

public class PersistentBugger {

    public static int persistence(long n) {
        int counter = 0;
        if (n < 10) {
            return 0;
        }
        while (n >= 10) {
            n = convertAndMultiply(n);
            counter++;
        }
        return counter;
    }

    private static long convertAndMultiply(long num) {
        return multiplyArray(
                convertStrArrayToIntArray(Long
                        .toString(num)
                        .split("")
                )
        );
    }

    private static int multiplyArray(int[] intArray) {
        int result = 1;
        for (int n : intArray) {
            result = result * n;
        }
        return result;
    }

    private static int[] convertStrArrayToIntArray(String[] strArray) {
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }
}
