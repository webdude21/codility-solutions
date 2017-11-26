package eu.webdude.codilitysolutions.stonewall;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8});
        System.out.println(result);
    }

    public int solution(int[] input) {
        int blockCount = 0;

        Deque<Integer> stack = new LinkedList<>();


        for (int height : input) {
            while (stack.size() != 0 && stack.peek() > height) {
                stack.pop();
            }

            if (stack.size() == 0 || stack.peek() != height) {
                blockCount++;
                stack.push(height);
            }
        }

        return blockCount;
    }
}
