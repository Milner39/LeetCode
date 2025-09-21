class Solution {
  public boolean isPalindrome(int x) {
  
    // Negative numbers cannot be palindromes
    if (x < 0) return false;

    // Single digit numbers are always palindromes
    if (x < 10) return true;


    // Get the number of digits
    int digits = 0;
    int y = x;
    while (y > 0) {
      digits++;
      y = y / 10;
    }

    // Calculate the number of comparisons that need to be made
    int iterations = digits / 2;


    // Get the left/right most digits are compare them each iteration
    int count = 0;
    while (count < iterations) {
      int left = x / (int) Math.pow(10, (digits - 1 - count));
      int right = x % (int) Math.pow(10, (count + 1)) / (int) Math.pow(10, count);

      // Not palindrome
      if (left != right) return false;

      // Subtract the current digit to make the maths easier next iteration
      x -= left * Math.pow(10, (digits - 1 - count));

      // Next iteration
      count++;
    }


    /*
      1d: always palindromes

      2d: (x / 10) must equal (x % 10)

      3d: (x / 100) must equal (x % 10)

      4d: (x / 1000) must equal (x % 10)
          x - 1000 * left
          (x / 100) must equal (x % 100 / 10)
      
      5d: (x / 10000) must equal (x % 10)
          x - 10000 * left
          (x / 1000) must equal (x % 100 / 10)

      6d: (x / 100000) must equal (x % 10)
          x - 100000 * left
          (x / 10000) must equal (x % 100 / 10)
          x - 10000 * left
          (x / 1000) must equal (x % 1000 / 100)
    */

    return true;
  }
}