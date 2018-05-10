package eu.webdude.codilitysolutions.maxprofit;

public class Solution {

  public static int solution(int[] input) {
    if (input.length == 0) {
      return 0;
    }

    int min = input[0];
    int profit = Integer.MIN_VALUE;

    for (int currentPrice : input) {
      min = Math.min(min, currentPrice);
      profit = Math.max(profit, currentPrice - min);
    }

    return profit;
  }

  public static void main(String[] args) {
    int[] testInput = new int[]{23171, 21011, 21123, 21366, 21013, 21367};
    System.out.println(solution(testInput));
  }
}
