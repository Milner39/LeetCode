class Solution {
	public String convert(String s, int numRows) {
		// If the number of rows is 1, no conversion needed
		if (numRows == 1) return s;


		// Get length of string to convert
		int sLen = s.length();

		// Initialise a char array to store converted string
		char[] converted = new char[sLen];


		// The difference in the pointers at the peaks of the zigzag
		int peakDif = (numRows -1) * 2;

		// The number of peaks in the zigzag
		int numPeaks = sLen / peakDif;
		if (sLen % peakDif > 0) numPeaks++;

		// The difference in pointers between the peak and trough of the zigzag
		int endRowOffset = numRows - 1;


		/*
			Add the chars that will be at the peaks and troughs of the zigzag.
			These are the chars that appear in the first and last rows.
			Which converts into the start and end of the new string.
		*/
		int troughsAdded = 0;
		for (int i = 0; i < numPeaks; i++) {
			// Start
			int startCharIndex = i * peakDif;
			converted[i] = s.charAt((startCharIndex));

			// End
			int endCharIndex = 
				 ((numPeaks -1) * peakDif) // Get to the end of the first row
				+(endRowOffset)			   // Get to the end of the last row
				-(i * peakDif);			   // Move left i times
			
			if (endCharIndex >= sLen) continue;
			converted[sLen - 1 - troughsAdded] = s.charAt(endCharIndex);
			troughsAdded++;
		}


		return String.valueOf(converted);
	}
}