class Solution {
  /*
    Merging the sorted arrays would be too slow, so straight away I know I'll
    be doing some sort of comparison between elements in each array.

    When finding the median, usually you'd get rid of the smallest number, then
    get of the largest number, and repeat until you had 1 or 2 numbers left.
    So I want to be looking at the smallest and largest number in the arrays.

    I need to keep in mind that the array containing the smallest number, or 
    the biggest number, won't stay the same each iteration.
  */
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    // Set pointers to compare the smallest and largest numbers in each array
    var p1L = 0;
    var p1R = nums1.length -1;

    var p2L = 0;
    var p2R = nums2.length -1;


    // Stop when only 1 or 2 numbers are left
    while (((p1R - p1L +1) + (p2R - p2L +1)) > 2) {
      // Get rid of smallest number
      if (nums1[p1L] < nums2[p2L]) {
        p1L++;
      } else {
        p2L++;
      }

      // Get rid of largest number
      if (nums1[p1R] > nums2[p2R]) {
        p1R--;
      } else {
        p2R--;
      }
    }


    // Get final numbers
    if (p2L > p2R) {                // Last numbers in nums1
      return (p1L + p1R) / 2;
    }
    else if (p1L > p1R) {
      return (p2L + p2R) / 2;       // Last numbers in nums2
    }
    else return (p1L + p2L) / 2;    // Last numbers
  }
}