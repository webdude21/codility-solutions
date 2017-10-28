package eu.webdude.codilitysolutions.oddoccurrencesinarray;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    public int solution(int[] input) {
        int result = input[0];

        for (int i = 1; i < input.length; i++) {
            result ^= input[i];
        }

        return result;
    }
}
