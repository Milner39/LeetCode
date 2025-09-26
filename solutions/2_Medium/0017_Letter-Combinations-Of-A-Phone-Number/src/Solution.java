import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Solution {

  // Map numbers to corresponding chars
  private static final Map<Character, char[]> digitToChars = Map.<Character, char[]>ofEntries(
    Map.entry('2', new char[]{'a','b','c'}),
    Map.entry('3', new char[]{'d','e','f'}),
    Map.entry('4', new char[]{'g','h','i'}),
    Map.entry('5', new char[]{'j','k','l'}),
    Map.entry('6', new char[]{'m','n','o'}),
    Map.entry('7', new char[]{'p','q','r','s'}),
    Map.entry('8', new char[]{'t','u','v'}),
    Map.entry('9', new char[]{'w','x','y','z'})
  );


  private void backtrack(List<String> res, StringBuilder sb, String d, int i) {
    // If we have added a char for each index
    if (i == d.length()) {
      // Add string to results and return
      res.add(sb.toString());
      return;
    }

    for (char c : digitToChars.get(d.charAt(i))) {
      sb.append(c);
      backtrack(res, sb, d, i+1);
      sb.deleteCharAt(sb.length()-1);
    }
  }


  public List<String> letterCombinations(String digits) {

    // Store number of combinations for faster `ArrayList` appending later
    int numCombos = 1;
    for (char digit : digits.toCharArray()) {
      numCombos *= digitToChars.get(digit).length;
    }

    // Create result list with know size
    List<String> result = new ArrayList<>(numCombos);
    if (digits.length() == 0) return result;

    backtrack(result, new StringBuilder(digits.length()), digits, 0);

    return result;
  }
}