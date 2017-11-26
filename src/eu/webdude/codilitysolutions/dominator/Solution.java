package eu.webdude.codilitysolutions.dominator;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3});
        System.out.println(result);
    }

    public int solution(int[] input) {
        int result = -1;

        Arrays.sort(input);

        int midPoint = input.length / 2;

        for (int i = 0; i < midPoint; i++) {
            if (input[i] == input[midPoint + i]) {
                return i;
            }
        }

        return result;
    }
}
