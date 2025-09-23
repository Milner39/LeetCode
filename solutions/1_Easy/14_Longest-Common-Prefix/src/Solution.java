class Solution {
  public String longestCommonPrefix(String[] strs) {

    // Start the common prefix off as the first word
    String prefix = strs[0];

    // Index for our words
    int i = 1;


    // While there are still common letters and we haven't checked every word
    while (prefix != "" && i < strs.length) {
      // Common prefix can never be longer than the shortest word
      if (prefix.length() > strs[i].length()) {
        prefix = prefix.substring(0, strs[i].length());
      }

      // Check the letters match
      for (int j = 0; j < prefix.length(); j++) {
        if (strs[i].charAt(j) != prefix.charAt(j)) {
          prefix = prefix.substring(0, j);
          break;
        }
      }
      
      // Next word
      i++;
    }

    return prefix;
  }
}