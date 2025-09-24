class Solution {
  public int removeDuplicates(int[] nums) {
    int unique = 0;
    int highest = Integer.MIN_VALUE;

    for (int num : nums) {
      if (num > highest) {
        highest = num;
        nums[unique] = num;
        unique++;
      }
    }

    return unique;
  }
}