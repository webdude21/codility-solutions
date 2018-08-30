package eu.webdude.codilitysolutions.oddoccurrencesinarray;

import java.util.Arrays;

public class Solution {

  public int solution(int[] input) {
    return Arrays.stream(input).reduce(0, (left, right) -> left ^= right);
  }
}
