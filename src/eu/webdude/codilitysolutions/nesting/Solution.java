package eu.webdude.codilitysolutions.nesting;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Solution {

    private static Map<Character, Character> pairMap = new HashMap<>();

    static {
        pairMap.put('(', ')');
        pairMap.put(')', '(');
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("(()(())())");
        System.out.println(result);
    }


    public int solution(String input) {
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '(') {
                stack.push(currentChar);
            } else if (stack.isEmpty()) {
                return 0;
            } else if (stack.peek() == pairMap.get(currentChar)) {
                stack.pop();
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}