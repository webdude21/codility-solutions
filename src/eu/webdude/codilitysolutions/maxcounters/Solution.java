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
        int lastUpdate = 0;

        for (int operation : operations) {
            if (isMaxCounter(countersCount, operation)) {
                lastUpdate = currentMax;
            } else {
                int position = operation - 1;
                if (counters[position] < lastUpdate) {
                    counters[position] = lastUpdate + 1;
                } else {
                    counters[position]++;
                }

                currentMax = Math.max(currentMax, counters[position]);
            }

        }

        for (int position = 0; position < countersCount; position++) {
            counters[position] = Math.max(counters[position], lastUpdate);
        }

        return counters;
    }

    private boolean isMaxCounter(int countersCount, int operation) {
        return operation == countersCount + 1;
    }
}
