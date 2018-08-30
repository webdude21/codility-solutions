package eu.webdude.codilitysolutions.cyclicrotation;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(Solution.solution(new int[]{3, 8, 9, 7, 6}, 3)));
  }

  public static int[] solution(int[] inputArray, int rotations) {
    var inputLength = inputArray.length;
    var rotated = new int[inputLength];

    for (var i = 0; i < inputLength; i++) {
      var rotatedIndex = (i + rotations) % inputLength;
      rotated[rotatedIndex] = inputArray[i];
    }

    return rotated;
  }
}
