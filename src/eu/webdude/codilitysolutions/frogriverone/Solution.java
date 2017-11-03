package eu.webdude.codilitysolutions.frogriverone;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4});
        System.out.println(result);
    }

    public int solution(int riverLength, int[] leaves) {
        int resultTime = -1;
        Set<Integer> fallenLeaves = new HashSet<>();

        for (int second = 0; second < leaves.length; second++) {
            fallenLeaves.add(leaves[second] - 1);

            boolean pathIsClear = fallenLeaves.size() == riverLength;

            if (pathIsClear) {
                return second;
            }
        }

        return resultTime;
    }
}
