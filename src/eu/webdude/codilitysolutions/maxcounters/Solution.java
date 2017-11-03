package eu.webdude.codilitysolutions.maxcounters;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int countersCount, int[] operations) {
        int[] counters = new int[countersCount];

        for (int operation : operations) {
            if (isIncrease(countersCount, operation)) {
                counters[operation - 1]++;
            }

            if (isMaxCounter(countersCount, operation)) {
                int max = Arrays.stream(counters).max().orElse(0);
                for (int i = 0; i < counters.length; i++) {
                    counters[i] = max;
                }
            }
        }

        return counters;
    }

    private boolean isIncrease(int countersCount, int operation) {
        return operation >= 1 && operation <= countersCount;
    }

    private boolean isMaxCounter(int countersCount, int operation) {
        return operation == countersCount + 1;
    }
}
