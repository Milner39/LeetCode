class Solution {
  public String longestPalindrome(String s) {
    // Get length of string
    int sLen = s.length();

    // Return empty string if provided empty string
    // Return single char if provided single char
    if (sLen <= 1) return s;


    // Initialise the max pointer
    int maxP = sLen -1;

    // Initialise the longest palindrome pointers
    int longestLP = 0;
    int longestRP = 0;

    // Initialise the longest palindrome length
    int longestLen = 1;


    /*
      Iterate through length of string.

      Start at 1 and end at max because we already know the longest 
      palindrome is at least 1 char.
    */
    for (int midP = 1; (midP <= maxP); midP++) {
      // End when it is not possible to find a longer palindrome
      if ((sLen - midP) < (longestLen / 2.0f)) break;

      // Find palindrome with an even centre
      int l = midP -1;
      int r = midP;
      while (l >= 0 && r <= maxP && s.charAt(l) == s.charAt(r)) {
        int subLen = r - l + 1;
        if (subLen > longestLen) {
          longestLP = l;
          longestRP = r;
          longestLen = subLen;
        }
        l--;
        r++;
      }


      // End when it is not possible to find a longer palindrome
      if ((sLen - midP) < (longestLen / 2.0f)) break;

      // Find palindrome with an odd centre
      l = midP -1;
      r = midP +1;
      while (l >= 0 && r <= maxP && s.charAt(l) == s.charAt(r)) {
        int subLen = r - l + 1;
        if (subLen > longestLen) {
          longestLP = l;
          longestRP = r;
          longestLen = subLen;
        }
        l--;
        r++;
      }
    }

    // Return substring, will default to first char if no longer palindrome found
    return s.substring(longestLP, longestRP +1);
  }
}