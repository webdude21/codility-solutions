package eu.webdude.codilitysolutions;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(9));
    }

    public int solution(int N) {
        String binaryInfo = Integer.toBinaryString(N);
        int maxGapLength = 0;
        int currentGapLength = 0;
        int startIndex = binaryInfo.indexOf('1');
        int endIndex = binaryInfo.lastIndexOf('1');

        if (!areThereGaps(startIndex, endIndex)) {
            return maxGapLength;
        }

        for (int i = startIndex; i < endIndex; i++) {
            if (isWithinGap(binaryInfo, i)) {
                currentGapLength++;
            } else {
                maxGapLength = Math.max(maxGapLength, currentGapLength);
                currentGapLength = 0;
            }
        }

        return Math.max(maxGapLength, currentGapLength);
    }

    private boolean isWithinGap(String binaryInfo, int i) {
        return binaryInfo.charAt(i) == '0';
    }


    private boolean areThereGaps(int startIndex, int endIndex) {
        return startIndex >= 0 && endIndex >= 0;
    }
}
