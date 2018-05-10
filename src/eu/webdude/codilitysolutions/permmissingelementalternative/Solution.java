package eu.webdude.codilitysolutions.permmissingelementalternative;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.solution(new int[]{5, 2, 3, 1}));
  }

  public int solution(int[] input) {
    int previous = 1;
    Arrays.sort(input);

    for (int i : input) {
      if (previous != i) {
        return previous;
      }
      previous++;
    }

    return previous;
  }
}
