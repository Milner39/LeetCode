class Solution {
  public int reverse(int x) {

    int reversed = 0;
    while (x != 0) {
      int digit = x % 10;

      // Check maths is reversible (no overflow)
      int tmp = (reversed * 10) + digit;
      if ((tmp - digit) / 10 != reversed) return 0;
      reversed = tmp;

      x /= 10;
    }

    return reversed;
  }
}