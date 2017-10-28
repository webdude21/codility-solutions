package eu.webdude.codilitysolutions.oddoccurrencesinarray;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    public int solution(int[] input) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();


        for (int anInput : input) {
            occurrenceMap.putIfAbsent(anInput, 0);
            occurrenceMap.put(anInput, occurrenceMap.get(anInput) + 1);
        }

        return occurrenceMap
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .getKey();
    }
}
