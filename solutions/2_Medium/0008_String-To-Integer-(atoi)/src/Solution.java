class Solution {
  public int myAtoi(String s) {
    int i = 0;
    int len = s.length();
    boolean isPos = true;
    int total = 0;


    // Ignore leading whitespace
    while (i < len && s.charAt(i) == ' ') i++;

    // Check sign, assuming positive if no sign present
    if (i < len && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
      isPos = (s.charAt(i) == '+');
      i++;
    }

    // Get total
    while (i < len) {
      int digit = Character.getNumericValue(s.charAt(i));
      if (digit == -1 || digit > 9) break;

      // Check for overflow
      if (total > (Integer.MAX_VALUE - digit) / 10) {
        return (isPos) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      total = (total * 10) + digit;

      i++;
    }

    // Apply sign
    return total * (isPos ? 1 : -1);
  }
}