package eu.webdude.codilitysolutions.brackets;

import java.util.*;

public class Solution {

  private static Map<Character, Character> pairMap = new HashMap<>();
  private static Set<Character> allowedElements = new HashSet<>(Arrays.asList('{', '[', '('));

  static {
    pairMap.put('{', '}');
    pairMap.put('(', ')');
    pairMap.put('[', ']');
    pairMap.put('}', '{');
    pairMap.put(')', '(');
    pairMap.put(']', '[');
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int result = solution.solution("{[()()]}");
    System.out.println(result);
  }


  public int solution(String input) {
    Deque<Character> stack = new LinkedList<>();

    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);

      if (allowedElements.contains(currentChar)) {
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
