package eu.webdude.codilitysolutions.passingcars;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{0, 1, 0, 1, 1});
        System.out.println(result);
    }

    public int solution(int[] input) {
        int east = 0;
        int passing = 0;

        for (int i : input) {
            if (i == 0) {
                east++;
            } else {
                passing += east;
            }

            if (passing > 1_000_000_000) {
                return -1;
            }
        }

        return passing;
    }
}
