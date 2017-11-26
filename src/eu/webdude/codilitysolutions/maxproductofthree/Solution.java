package eu.webdude.codilitysolutions.maxproductofthree;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{-3, 1, 2, -2, 5, 6});
        System.out.println(result);
    }

    public int solution(int[] input) {
        Arrays.sort(input);

        int candidateOne = input[0] * input[1] * input[input.length - 1];
        int candidateTwo = input[input.length - 1] * input[input.length - 2] * input[input.length - 3];

        return Math.max(candidateOne, candidateTwo);
    }
}
