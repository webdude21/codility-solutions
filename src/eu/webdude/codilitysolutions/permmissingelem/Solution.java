package eu.webdude.codilitysolutions.permmissingelem;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{5, 2, 3, 1}));
    }

    public int solution(int[] input) {
        long n = input.length + 1;
        final long expectedProggressionSum = n * (n + 1) / 2;
        long result = expectedProggressionSum;

        for (int i : input) {
            result -= i;
        }

        return (int) result;
    }
}
