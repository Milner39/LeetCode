import java.util.Arrays;

class Solution {
  public int threeSumClosest(int[] nums, int target) {

    // O(nlog(n))
    Arrays.sort(nums);

    // Start the smallest difference of as max so anything else is preferred
    int smallestDiff = Integer.MAX_VALUE;

    // Iterate only up to the 3rd last number to leave space for 2 more nums
    for (int i = 0; i < nums.length - 2; i++) {
      int A = nums[i];

      // If this num is the same as it was last iteration...
      if (i > 0 && A == nums[i-1]) continue;  // Skip duplicate

      // Left and right pointers for the rest of the list
      int l = i + 1; int r = nums.length - 1;
      while (l < r) {
        int B = nums[l]; int C = nums[r];
        int sum = A + B + C;

        // Calculate and compare differences from target
        int diff = sum - target;
        if (Math.abs(diff) < Math.abs(smallestDiff)) smallestDiff = diff;

        // Too small
        if (sum < target) {
          l++;
          while (B == nums[l] && l < r) l++;
        }
        
        // Too big
        else if (sum > target) {
          r--;
          while (C == nums[r] && l < r) r--;
        }

        // Target found
        else {
          return target;
        }
      }
    }

    return target + smallestDiff;
  }
}