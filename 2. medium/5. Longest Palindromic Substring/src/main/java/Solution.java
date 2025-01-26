class Solution {
	public String longestPalindrome(String s) {
		// Get length of string
		int len = s.length();

		// Return empty string if provided empty string
		// Return single char if provided single char
		if (len <= 1) return s;


		// Initialise the max pointer
		int max = len -1;

		// Initialise the longest palindrome
		String longest = null;
		int longestLen = 1;


		/*
			Iterate through length of string.

			Start at 1 and end at max because we already know the longest 
			palindrome is at least 1 char.
		*/
		for (int mid = 1; (mid <= max); mid++) {
			// End when it is not possible to find a longer palindrome
			if ((len - mid) < (longestLen / 2.0f)) break;

			// even
			int l = mid -1;
			int r = mid;
			while (l >= 0 && r <= max && s.charAt(l) == s.charAt(r)) {
				int subLen = r - l + 1;
				if (subLen > longestLen) {
					longest = s.substring(l, r +1);
					longestLen = subLen;
				}
				l--;
				r++;
			}


			// End when it is not possible to find a longer palindrome
			if ((len - mid) < (longestLen / 2.0f)) break;

			// odd
			l = mid -1;
			r = mid +1;
			while (l >= 0 && r <= max && s.charAt(l) == s.charAt(r)) {
				int subLen = r - l + 1;
				if (subLen > longestLen) {
					longest = s.substring(l, r +1);
					longestLen = subLen;
				}
				l--;
				r++;
			}
		}

		// If no palindrome longer than 1 found, set longest to first char
		if (longest == null) longest = s.substring(0, 1);

		return longest;
	}
}