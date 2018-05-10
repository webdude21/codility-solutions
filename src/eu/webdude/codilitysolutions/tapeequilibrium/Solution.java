package eu.webdude.codilitysolutions.tapeequilibrium;

public class Solution {

  public static void main(String[] args) {
    Solution currentSolution = new Solution();
    System.out.println(currentSolution.solution(new int[]{3, 1, 2, 4, 3}));
  }

  public int solution(int[] input) {
    int n = input.length;
    int left = input[0];
    int right = 0;

    for (int i = 1; i < n; i++) {
      right += input[i];
    }

    int min = Math.abs(left - right);

    for (int i = 1; i < n - 1; i++) {
      left += input[i];
      right -= input[i];

      min = Math.min(Math.abs(left - right), min);
    }

    return min;
  }
}
