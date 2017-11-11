package eu.webdude.codilitysolutions.genomicrangequery;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<Character, Integer> impactMap = new HashMap<>();

    static {
        impactMap.put('A', 1);
        impactMap.put('C', 2);
        impactMap.put('G', 3);
        impactMap.put('T', 4);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(String input, int[] from, int[] to) {
        int[] result = new int[from.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = getSmallestImpact(input, from[i], to[i] + 1);
        }

        return result;
    }

    private int getSmallestImpact(String input, int from, int to) {
        return input
                .substring(from, to)
                .chars()
                .map(x -> impactMap.get((char) x))
                .min()
                .orElse(1);
    }
}
