package eu.webdude.codilitysolutions.fish;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0});
        System.out.println(result);
    }

    public int solution(int[] fishSize, int[] flowDirection) {

        for (int i = 0; i < fishSize.length; i++) {
            if (isUpStream(flowDirection[i])){

            }
        }

        return 0;
    }

    private boolean isUpStream(int i) {
        return i == 0;
    }
}