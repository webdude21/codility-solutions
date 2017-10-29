package eu.webdude.codilitysolutions.permcheck;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {4, 1, 3};
        int result = solution.solution(input);
        System.out.println(result);
    }

    public int solution(int[] input) {
        Arrays.sort(input);

        for (int i = 0; i < input.length; i++) {
            if (i + 1 != input[i]) {
                return 0;
            }
        }

        return 1;
    }
}
