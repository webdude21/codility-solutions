package eu.webdude.codilitysolutions.minavgtwoslice;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
        System.out.println(solution.solution(new int[]{-3, -5, -8, -4, -10}));
    }


    public int solution(int[] input) {
        int minIndex = 0;
        double minValue = 100_000_000;

        for (int i = 0; i < input.length - 1; i++) {
            double twoStep = (input[i] + input[i + 1]) / 2.0;
            if (twoStep < minValue) {
                minIndex = i;
                minValue = twoStep;
            }

            if (i + 1 < input.length - 1) {
                double treeStep = (input[i] + input[i + 1] + input[i + 2]) / 3.0;
                if (treeStep < minValue){
                    minIndex = i;
                    minValue = treeStep;
                }
            }
        }

        return minIndex;
    }
}
