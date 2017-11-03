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
        int currentMax = 0;

        for (int operation : operations) {
            if (isIncrease(countersCount, operation)) {
                counters[operation - 1]++;
                if (currentMax < counters[operation - 1]){
                    currentMax = counters[operation - 1];
                }
                continue;
            }

            if (isMaxCounter(countersCount, operation)) {
                for (int i = 0; i < counters.length; i++) {
                    counters[i] = currentMax;
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
