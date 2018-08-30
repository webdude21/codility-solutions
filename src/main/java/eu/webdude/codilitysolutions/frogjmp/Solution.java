package eu.webdude.codilitysolutions.frogjmp;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.solution(10, 85, 30));
  }

  public int solution(int start, int end, int jumpDistance) {
    int distanceToCover = Math.abs(end - start);
    int remainder = distanceToCover % jumpDistance > 0 ? 1 : 0;
    return (distanceToCover / jumpDistance) + remainder;
  }
}
