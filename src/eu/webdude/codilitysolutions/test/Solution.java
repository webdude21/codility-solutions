package eu.webdude.codilitysolutions.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  static int task01(int x, int[] input) {
    var xCount = (int) Arrays.stream(input).filter(num -> num == x).count();
    var inputLength = input.length;
    var allAreXes = xCount == inputLength;
    var noneAreXes = xCount == 0;

    if (allAreXes || noneAreXes) {
      return 0;
    }

    var xOccurrences = 0;
    var diffCount = inputLength - xCount;
    var index = 0;

    while (xOccurrences != diffCount && index != inputLength - 1) {
      if (input[index] == x) {
        xOccurrences++;
      } else {
        diffCount--;
      }
      index++;
    }

    return index;
  }

  static int[] task02(int[] bits) {
    var x = negativeBinaryToDecimal(bits);
    return decimalToNegativeBinary(-x);
  }

  private static int[] decimalToNegativeBinary(int value) {
    List<Integer> result = new ArrayList<>();
    var base = -2;

    while (value != 0) {
      var remainder = value % base;
      value /= base;

      if (remainder < 0) {
        remainder += 2;
        value += 1;
      }

      result.add(remainder);
    }

    return result
      .stream()
      .mapToInt(Integer::intValue)
      .toArray();
  }


  static int negativeBinaryToDecimal(int[] input) {
    var result = 0;
    var base = -2;

    for (var i = 0; i < input.length; i++) {
      result += input[i] * Math.pow(base, i);
    }

    return result;
  }
}
