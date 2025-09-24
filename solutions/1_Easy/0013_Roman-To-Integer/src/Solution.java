import java.util.Map;

class Solution {
  public int romanToInt(String s) {

    // Map to get the value of each symbol
    Map<Character, Integer> symbols = Map.of(
      'I', 1,
      'V', 5,
      'X', 10,
      'L', 50,
      'C', 100,
      'D', 500,
      'M', 1000
    );

    // Length of the roman numeral
    int len = s.length();

    // Holds the total value as we iterate through the Roman Numeral
    int total = 0;

    // Iterate through the Roman Numeral
    for (int i = 0; i < len; i++) {
      // Get the value of the current char
      int current = symbols.get(s.charAt(i));

      // Get the value of the next char (MIN if we have reached the end)
      int next = (i + 1 < len) ?
        symbols.get(s.charAt(i + 1)) :
        Integer.MIN_VALUE;

      // If the next char is a larger value than the current,
      // we have to do a subtraction before adding to the total
      if (next > current) {
        total += (next - current);
        i++;  // Skip the next number
        continue;
      }

      total += current;
    }

    return total;
  }
}