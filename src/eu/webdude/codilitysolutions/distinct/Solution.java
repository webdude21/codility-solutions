package eu.webdude.codilitysolutions.distinct;

import java.util.stream.IntStream;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int result = solution.solution(new int[]{2, 1, 1, 2, 3, 1});
    System.out.println(result);
  }

  public int solution(int[] input) {
    return (int) IntStream.of(input).distinct().count();
  }
}
