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
      double sliceOfTwo = averageSlice(input, i, i + 1);
      if (sliceOfTwo < minValue) {
        minIndex = i;
        minValue = sliceOfTwo;
      }

      if (i + 1 < input.length - 1) {
        double sliceOfThree = averageSlice(input, i, i + 2);
        if (sliceOfThree < minValue) {
          minIndex = i;
          minValue = sliceOfThree;
        }
      }
    }

    return minIndex;
  }

  private double averageSlice(int[] input, int start, int end) {
    int result = 0;

    double count = end - start + 1;

    for (int i = start; i <= end; i++) {
      result += input[i];
    }

    return result / count;
  }
}
