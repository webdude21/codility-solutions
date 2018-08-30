package eu.webdude.codilitysolutions.countdiv;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int result = solution.solution(5, 11, 2);
    System.out.println(result);
  }

  public int solution(int start, int end, int divisor) {
    int offsetForLeftRange = 0;

    if (start % divisor == 0) {
      ++offsetForLeftRange;
    }

    return (end / divisor) - (start / divisor) + offsetForLeftRange;
  }
}
