package eu.webdude.codilitysolutions.cyclicrotation;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(Arrays.toString(solution.solution(new int[]{3, 8, 9, 7, 6}, 3)));
  }

  public int[] solution(int[] inputArray, int rotations) {
    int arrayLength = inputArray.length;
    int[] rotatedArray = new int[arrayLength];

    for (int i = 0; i < arrayLength; i++) {
      int rotatedIndex = (rotations + i) % arrayLength;
      rotatedArray[rotatedIndex] = inputArray[i];
    }

    return rotatedArray;
  }
}
