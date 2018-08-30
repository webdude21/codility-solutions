package eu.webdude.codilitysolutions.genomicrangequery;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] result = solution.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
    System.out.println(Arrays.toString(result));
  }

  public int[] solution(String input, int[] from, int[] to) {
    int[][] genoms = new int[3][input.length() + 1];
    int[] result = new int[from.length];
    int a, c, g;

    for (int i = 0; i < input.length(); i++) {
      char chr = input.charAt(i);

      a = 'A' == chr ? 1 : 0;
      c = 'C' == chr ? 1 : 0;
      g = 'G' == chr ? 1 : 0;

      genoms[0][i + 1] = genoms[0][i] + a;
      genoms[1][i + 1] = genoms[1][i] + c;
      genoms[2][i + 1] = genoms[2][i] + g;
    }

    for (int i = 0; i < from.length; i++) {
      int fromIndex = from[i];
      int toIndex = to[i] + 1;
      if (genoms[0][toIndex] - genoms[0][fromIndex] > 0) {
        result[i] = 1;
      } else if (genoms[1][toIndex] - genoms[1][fromIndex] > 0) {
        result[i] = 2;
      } else if (genoms[2][toIndex] - genoms[2][fromIndex] > 0) {
        result[i] = 3;
      } else {
        result[i] = 4;
      }
    }
    return result;
  }
}
