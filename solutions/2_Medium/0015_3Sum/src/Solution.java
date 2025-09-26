import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    // O(nlog(n))
    Arrays.sort(nums);


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

        // Too small
        if (sum < 0) {
          l++;
        }
        
        // Too big
        else if (sum > 0) {
          r--;
        }

        // Triplet found
        else {
          result.add(List.of(A,B,C));
          l++;
          while (nums[l] == nums[l-1] && l < r) l++;
        }
      }
    }

    return result;
  }
}