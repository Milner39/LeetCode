import java.util.ArrayList;
import java.util.Map;

class Solution {
  public boolean isValid(String s) {

    ArrayList<Character> stack = new ArrayList<>();
    Map<Character, Character> pairs = Map.of(
      ')', '(',
      '}', '{',
      ']', '['
    );

    for (char par : s.toCharArray()) {
      switch (par) {
        // If opening parentheses, then add to the stack
        case '(':
        case '{':
        case '[':
          stack.add(par);
          break;

        // Otherwise, check closing matches last opening
        case ')':
        case '}':
        case ']':
          if (stack.isEmpty()) return false;
          if (stack.getLast() == pairs.get(par)) {
            stack.removeLast();
            break;
          }

        // If closing parentheses does not match last opening
        default:
          return false;
      }
    }

    return (stack.size() == 0);
  }
}