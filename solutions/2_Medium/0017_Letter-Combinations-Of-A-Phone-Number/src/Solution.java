import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Solution {
  public List<String> letterCombinations(String digits) {

    int len = digits.length();

    if (len == 0) return List.of();


    // Map numbers to corresponding chars
    Map<Character, char[]> digitToChars = Map.<Character, char[]>ofEntries(
      Map.entry('2', new char[]{'a','b','c'}),
      Map.entry('3', new char[]{'d','e','f'}),
      Map.entry('4', new char[]{'g','h','i'}),
      Map.entry('5', new char[]{'j','k','l'}),
      Map.entry('6', new char[]{'m','n','o'}),
      Map.entry('7', new char[]{'p','q','r','s'}),
      Map.entry('8', new char[]{'t','u','v'}),
      Map.entry('9', new char[]{'w','x','y','z'})
    );


    // Store number of combinations for faster `ArrayList` access later
    int numCombos = 1;

    // Store the characters that correspond to each digit in `digits`
    char[][] charComboOrder = new char[len][];

    // Iterate over `digits` to populate our variables
    char[] digitArray = digits.toCharArray();
    for (int i = 0; i < len; i++) {
      char[] chars = digitToChars.get(digitArray[i]);
      numCombos *= chars.length;
      charComboOrder[i] = chars;
    }


    // List of `StringBuilder`s for faster concatenation
    List<StringBuilder> combinations = new ArrayList<>(numCombos);
    for (int i = 0; i < numCombos; i++) {
      combinations.add(new StringBuilder());
    }

    // Fill out our combinations
    int groups = 1;
    for (int i = 0; i < len; i++) {
      // For each digit, get corresponding chars
      char[] chars = charComboOrder[i];
      int options = chars.length;  // Get the number of chars for that digit
      groups *= options;  // Get the number of possible combinations this iteration

      for (int j = 0; j < numCombos; j++) {
        // If only a third of the total combinations are possible this iteration, 
        // Then the current char will show up 3 times before moving onto the next 
        // one.
        int charIndex = (j*groups/numCombos)%options;
        combinations.get(j).append(chars[charIndex]);
      }
    }

    // Create a new `ArrayList` and convert all the combinations into strings
    List<String> result = new ArrayList<>(numCombos);
    for (int i = 0; i < numCombos; i++) {
      result.add(combinations.get(i).toString());
    }

    return result;
  }
}

// This is probably not the right way, but it's my way