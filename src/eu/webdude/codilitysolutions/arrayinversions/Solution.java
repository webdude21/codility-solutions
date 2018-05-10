package eu.webdude.codilitysolutions.arrayinversions;

import java.util.Arrays;

public class Solution {

  private static int inversions;

  static int solution(int[] testInput) {
    inversions = 0;

    int[] mergeSort = sort(testInput);

    return inversions;
  }

  public static int[] sort(int[] input) {
    int length = input.length;

    if (length <= 1) {
      return input;
    }

    int[] left = sort(Arrays.copyOfRange(input, 0, length / 2));
    int[] right = sort(Arrays.copyOfRange(input, length / 2, length));

    return merge(left, right);
  }

  private static int[] merge(int[] left, int[] right) {
    int[] result = new int[left.length + right.length];
    int leftIndex = 0;
    int rightIndex = 0;

    for (int i = 0; i < result.length; i++) {
      boolean leftInRange = leftIndex < left.length;
      boolean rightInRange = rightIndex < right.length;

      if (leftInRange && rightInRange) {
        if (left[leftIndex] < right[rightIndex]) {
          result[i] = left[leftIndex++];
        } else {
          result[i] = right[rightIndex++];
          inversions += (left.length - i);
        }
      } else if (leftInRange) {
        result[i] = left[leftIndex++];
      } else {
        result[i] = right[rightIndex++];
      }
    }

    return result;
  }
}
