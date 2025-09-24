class Solution {
  public boolean isPalindrome(int x) {
  
    // Negative numbers cannot be palindromes
    if (x < 0) return false;

    // // Single digit numbers are always palindromes
    if (x < 10) return true;


    // Get the number of digits
    int d = 2;
    while (x >= Math.pow(10, d)) {
      d++;
    }

    // Iteratively check and remove the left and right most digits
    while (x > 0) {
      if ((x / (int) Math.pow(10, d-1)) != (x % 10)) return false;

      x = (x % (int) Math.pow(10, d-1)) / 10;
      d -= 2;
    }

    return true;
  }
}