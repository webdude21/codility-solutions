package eu.webdude.codilitysolutions.missinginteger;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int result = solution.solution(new int[]{1, 2, 3});
    System.out.println(result);
    int resultAlternate = solution.solution(new int[]{1, 3, 6, 4, 1, 2});
    System.out.println(resultAlternate);
  }

  public int solution(int[] input) {
    Arrays.sort(input);
    int smallestMissing = 1;

    for (int i : input) {
      if (i == smallestMissing) {
        smallestMissing++;
      }
    }

    return smallestMissing;
  }
}
