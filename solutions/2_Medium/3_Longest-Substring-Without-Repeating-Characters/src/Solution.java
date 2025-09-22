import java.util.HashSet;

class Solution {
  public int lengthOfLongestSubstring(String s) {
    /*
      Initialise a Set to hold the chars in the sliding window.
      This allows me to look up keys in O(1).
    */
    HashSet<Character> window = new HashSet<>();

    // Initialise start of sliding window
    int start = 0;
    
    // Initialize the length of the longest substring to 0
    int longest = 0;


    // Initialise end of sliding window
    for (int end = 0; end < s.length(); end++) {
      // If the char at the end of the window is in the set
      while (window.contains(s.charAt(end))) {
        // Remove the char at the start of the window
        window.remove(s.charAt(start));
        start++;
      }

      // Add the char at the end of the window
      window.add(s.charAt(end));

      // Update the length of longest substring
      longest = Math.max(
        longest,
        end - start + 1
      );
    }

    return longest;
  }
}