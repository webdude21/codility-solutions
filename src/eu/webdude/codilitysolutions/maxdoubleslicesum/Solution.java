package eu.webdude.codilitysolutions.maxdoubleslicesum;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{3, 2, 6, -1, 4, 5, -1, 2});
        System.out.println(result);
    }

    public int solution(int[] input) {
        int inputLength = input.length;
        int[] K1 = new int[inputLength];
        int[] K2 = new int[inputLength];

        for (int i = 1; i < inputLength - 1; i++) {
            K1[i] = Math.max(K1[i - 1] + input[i], 0);
        }

        for (int i = inputLength - 2; i > 0; i--) {
            K2[i] = Math.max(K2[i + 1] + input[i], 0);
        }

        int max = 0;

        for (int i = 1; i < inputLength - 1; i++) {
            max = Math.max(max, K1[i - 1] + K2[i + 1]);
        }

        return max;
    }
}
