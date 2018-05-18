package eu.webdude.codilitysolutions.cyclicrotation;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(Solution.solution(new int[]{3, 8, 9, 7, 6}, 3)));
  }

  public static int[] solution(int[] inputArray, int rotations) {
    int inputLength = inputArray.length;
    int[] rotated = new int[inputLength];

    for (int i = 0; i < inputLength; i++) {
      int rotatedIndex = (i + rotations) % inputLength;
      rotated[rotatedIndex] = inputArray[i];
    }

    return rotated;
  }
}
