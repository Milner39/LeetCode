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
      if (p1L == nums1.length) p2L++;
      else if (p2L == nums2.length) p1L++; 
      else if (nums1[p1L] < nums2[p2L]) {
        p1L++;
      } else {
        p2L++;
      }

      // Get rid of largest number
      if (p1R == -1) p2R--;
      else if (p2R == -1) p2L--; 
      else if (nums1[p1R] > nums2[p2R]) {
        p1R--;
      } else {
        p2R--;
      }
    }


    // Get final numbers

    // Both in nums1
    if (p2L > p2R) {
      return (double) (nums1[p1L] + nums1[p1R]) / 2;
    }

    // Both in nums2
    else if (p1L > p1R) {
      return (double) (nums2[p2L] + nums2[p2R]) / 2;
    }

    // One in each
    else return (double) (nums1[p1L] + nums2[p2L]) / 2;
  }
}