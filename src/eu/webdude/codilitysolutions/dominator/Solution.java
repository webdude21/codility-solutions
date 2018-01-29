package eu.webdude.codilitysolutions.dominator;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3});
        System.out.println(result);
    }

    public int solution(int[] input) {
        if (input.length == 1){
            return 0;
        }

        Arrays.sort(input);

        int midPoint = input.length / 2;

        int currentCount = 0;
        int currentElement = Integer.MIN_VALUE;

        for (int i = 0, inputLength = input.length; i < inputLength; i++) {
            int current = input[i];
            if (current != currentElement) {
                currentElement = current;
                currentCount = 0;
            }

            currentCount++;

            if (currentCount > midPoint) {
                return i;
            }
        }

        return -1;
    }
}