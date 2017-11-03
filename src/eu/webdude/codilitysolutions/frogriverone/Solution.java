package eu.webdude.codilitysolutions.frogriverone;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4});

        System.out.println(result);
    }

    public int solution(int riverLength, int[] leaves) {
        int resultTime = -1;
        boolean[] river = new boolean[riverLength];

        for (int i = 0; i < leaves.length; i++) {
            river[leaves[i] - 1] = true;
            if (pathIsClear(river)){
                return i;
            }
        }

        return resultTime;
    }

    private boolean pathIsClear(boolean[] river) {
        for (boolean b : river) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}
