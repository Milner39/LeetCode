class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    /* Make nums1 the smallest array
      Picking the smallest array to do binary search on makes our time 
      complexity `O(log(min(n, m)))`.
    */
    if (nums1.length > nums2.length) {
      var tmp = nums1;
      nums1 = nums2;
      nums2 = tmp;
    }


    // Calculate helpful variables
    int     total = nums1.length + nums2.length;
    int     half  = total / 2;
    boolean isOdd = (total % 2 == 1);


    // Set pointers to either end of nums1 for binary search
    int left = 0;
    int right = nums1.length -1;

    // Binary search
    while (true) {
      // Get middle pointer of nums1
      int m1 = (left + right) / 2;

      /* Get middle pointer of nums2
        To calculate this position, we know that half of the numbers should be 
        in the "low" group and half should be in the "high" group.

        All the numbers in nums1 from 0 to m1 will be in our low group, so we 
        can calculate how many numbers are left to be included in the low group.

        This will be shown by this pointer for nums2.
      */ 
      int m2 = half - m1 -2;


      // Get the values of each number at the border of the "low-high" groups
      int low1  = (m1 >= 0)             ? nums1[m1]   : Integer.MIN_VALUE;
      int high1 = (m1+1 < nums1.length) ? nums1[m1+1] : Integer.MAX_VALUE;
      int low2  = (m2 >= 0)             ? nums2[m2]   : Integer.MIN_VALUE;
      int high2 = (m2+1 < nums2.length) ? nums2[m2+1] : Integer.MAX_VALUE;


      // If our groups are correct
      if (low1 <= high2 && low2 <= high1) {
        // Odd
        if (isOdd) {
          return Math.min(high1, high2);
        }

        // Even
        return (double) (Math.max(low1, low2) + Math.min(high1, high2)) / 2;
      }


      // nums1 low group too big
      else if (low1 > high2) {
        right = m1 -1;
      }

      // nums1 low group too small
      else {
        left = m1 +1;
      }
    }
  }
}