class Solution {
	public boolean isPalindrome(String s) {
		// Initialise the max pointer
		int max = s.length() -1;
		float mid = max / 2.0f;

		// Run until offset is more than half way through the string
		for (int offset = 0; offset < mid; offset++) {
			// If chars at each end of string do not match
			if (s.charAt(offset) != s.charAt(max - offset)) return false;
		}

		return true;
	}
	

	public String longestPalindrome(String s) {
		// Initialise the max pointer
		int max = s.length() -1;

		// Initialise the longest palindrome
		String longest = "";
		int longestLen = 0;


		/*
			Only continue if there are enough chars left to create a longer 
			palindrome.
		*/
		for (
			int start = 0;
			(max - start) >= longestLen;
			start++
		) {
			/*
				Start the end pointer at the position where the sub string is
				larger then the current longest palindrome.

				Then continue until end of string.
			*/
			for (
				int end = start +1 + longestLen;
				end <= max +1;
				end++
			) {
				// Get substring
				String subS = s.substring(start, end);
				int subSLen = subS.length();

				// If the substring is bigger and is a palindrome
				if (subSLen > longestLen && isPalindrome(subS)) {
					longest = subS;
					longestLen = subSLen;
				}
			}
		}

		return longest;
	}
}