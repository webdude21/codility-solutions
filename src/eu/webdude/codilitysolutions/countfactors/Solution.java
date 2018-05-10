package eu.webdude.codilitysolutions.countfactors;

public class Solution {

  public static void main(String[] args) {
    System.out.println(solution(24));
  }

  public static int solution(int N) {
    int factors = 0;

    double limit = Math.sqrt(N);

    for (int i = 1; i <= limit; i++) {
      if (N % i == 0) {
        if (i * i != N) {
          factors += 2;
        } else if (i * i == N) {
          factors += 1;
        }
      }
    }

    return factors;
  }

}
