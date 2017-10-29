package eu.webdude.codilitysolutions.permmissingelementalternative;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        eu.webdude.codilitysolutions.permmissingelem.Solution solution = new eu.webdude.codilitysolutions.permmissingelem.Solution();
        System.out.println(solution.solution(new int[]{5, 2, 3, 1}));
    }

    public int solution(int[] input) {
        int previous = 0;

        if (input.length == 0) {
            return 1;
        }

        Arrays.sort(input);
        for (int i : input) {
            if (++previous != i) {
                return previous;
            }
        }
        return previous + 1;
    }
}
