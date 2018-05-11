package eu.webdude.codilitysolutions.arrayinversions;

import java.util.Arrays;

public class Solution {

  private static int inversions;

  static int solution(int[] testInput) {
    inversions = 0;

    sort(testInput);

    return inversions >= 1_000_000_000 ? -1 : inversions;
  }

  private static int[] sort(int[] input) {
    int length = input.length;

    if (length <= 1) {
      return input;
    }

    int[] left = sort(Arrays.copyOfRange(input, 0, length / 2));
    int[] right = sort(Arrays.copyOfRange(input, length / 2, length));

    return merge(left, right);
  }

  private static int[] merge(int[] left, int[] right) {
    int combinedLength = left.length + right.length;
    int[] result = new int[combinedLength];
    int leftIndex = 0;
    int rightIndex = 0;

    for (int i = 0; i < result.length; i++) {
      if (leftIndex < left.length && rightIndex < right.length) {
        if (left[leftIndex] <= right[rightIndex]) {
          result[i] = left[leftIndex++];
        } else {
          result[i] = right[rightIndex++];
          inversions += (left.length - leftIndex);
        }
      } else if (leftIndex < left.length) {
        result[i] = left[leftIndex++];
      } else {
        result[i] = right[rightIndex++];
      }
    }

    return result;
  }
}
