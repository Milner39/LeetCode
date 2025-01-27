class Solution {
	public String convert(String s, int numRows) {
		// If the number of rows is 1, no conversion needed
		if (numRows == 1) return s;


		// Get length of string to convert
		int sLen = s.length();

		// The index difference of chars at the peaks of the zigzag
		int peakDif = (numRows -1) * 2;


		// Initialise a char array to store converted string
		char[] converted = new char[sLen];
		
		// Next index to add char into
		int convertedIndex = 0;


		/*
			Iterate through string row by row.
			The original index of the 1st char in the 1st row will be 0,
			The original index of the 1st char in the 2nd row will be 1,
			The original index of the 1st char in the 3rd row will be 2,
			etc.
		*/
		for (int i = 0; i < numRows; i++) {
			int sIndex = i;
			while (sIndex < sLen) {
				// Add the char at the current row and column
				converted[convertedIndex] = s.charAt(sIndex);
				convertedIndex++;

				// If not the first or last row
				if (i != 0 && i != numRows -1) {
					// For middle rows

					/*
						Get the index of the extra char that appears before 
						the next column.
					*/
					int extraCharIndex = sIndex + peakDif - (2 * i);

					// If index exceeds length of string, break out of while loop
					if (extraCharIndex >= sLen) break;

					// Add the extra char
					converted[convertedIndex] = s.charAt(extraCharIndex);
					convertedIndex++;
				}

				// Go to the next column
				sIndex+= peakDif;
			}
		}


		return String.valueOf(converted);
	}
}