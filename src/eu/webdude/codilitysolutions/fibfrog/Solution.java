package eu.webdude.codilitysolutions.fibfrog;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        printResult(new int[]{0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0}, 3);
        printResult(new int[]{0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0}, 1);
        printResult(new int[]{1, 0, 0, 0, 0}, 2);
        printResult(new int[]{1, 1, 0, 0, 0}, 2);
    }

    private static void printResult(int[] input, int expected) {
        System.out.printf("%d == %d%n", solution(input), expected);
    }

    private static boolean canJumpTo(int[] arr, int jumpSpot) {
        return jumpSpot <= arr.length && (jumpSpot == arr.length || arr[jumpSpot] == 1);
    }

    private static boolean hasReachedTheEndOfTheRiver(int[] input, int frogCurrentPos) {
        return frogCurrentPos == input.length;
    }

    public static int solution(int[] input) {
        if (input.length <= 2) {
            return 1;
        }

        int[] fibonacciArray = fibStream(25)
                .filter(fib -> fib <= input.length + 1)
                .toArray();

        int numberOfJumps = 0;
        int frogCurrentPos = -1;

        for (int fib = fibonacciArray.length - 1; fib >= 0; fib--) {
            int currentJumpSize = fibonacciArray[fib];

            int possibleJumpSpot = frogCurrentPos + currentJumpSize;

            if (canJumpTo(input, possibleJumpSpot)) {
                frogCurrentPos = possibleJumpSpot;
                numberOfJumps += 1;
                fib = fibonacciArray.length;
            }
        }

        return hasReachedTheEndOfTheRiver(input, frogCurrentPos) ? numberOfJumps : -1;
    }

    private static IntStream fibStream(int limit) {
        return Stream
                .iterate(new int[]{1, 1}, p -> new int[]{p[1], p[0] + p[1]})
                .limit(limit)
                .mapToInt(x -> x[0]);
    }
}
