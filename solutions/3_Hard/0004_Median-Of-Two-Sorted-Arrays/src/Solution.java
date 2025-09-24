// class Solution {
//   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//     var A = nums1;
//     var B = nums2;

//     /* Make A the smallest array
//       Picking the smallest array to do binary search on makes our time 
//       complexity `O(log(min(n, m)))`.
//     */
//     if (A.length > B.length) {
//       var tmp = A;
//       A = B;
//       B = tmp;
//     }


//     // Calculate helpful variables
//     int     total = nums1.length + nums2.length;
//     int     half  = total / 2;
//     boolean isOdd = (total % 2 == 1);


//     // Set pointers to either end of A for binary search
//     int l = 0;
//     int r = A.length - 1;

//     // Binary search
//     while (true) {
//       // Get middle pointer of A
//       int i = (l + r) / 2;

//       /* Get middle pointer of B
//         To calculate this position, we know that half of the numbers should be 
//         in the "low" group and half should be in the "high" group.

//         All the numbers in A from 0 to i will be in our low group, so we 
//         can calculate how many numbers from B are left to be included in the 
//         low group.

//         This will be shown by this pointer for B.
//       */ 
//       int j = half - i - 2;


//       // Get the values of each number at the border of the "low-high" groups
//       int ALow  = (i >= 0)           ? A[i]     : Integer.MIN_VALUE;
//       int AHigh = (i + 1 < A.length) ? A[i + 1] : Integer.MAX_VALUE;
//       int BLow  = (j >= 0)           ? B[j]     : Integer.MIN_VALUE;
//       int BHigh = (j + 1 < B.length) ? B[j + 1] : Integer.MAX_VALUE;


//       // If our groups are correct
//       if (ALow <= BHigh && BLow <= AHigh) {
//         // Odd
//         if (isOdd) {
//           return Math.min(AHigh, BHigh);
//         }

//         // Even
//         return (Math.max(ALow, BLow) + Math.min(AHigh, BHigh)) / 2.0;
//       }


//       // A low group too big
//       else if (ALow > BHigh) {
//         r = i - 1;
//       }

//       // A low group too small
//       else {
//         l = i + 1;
//       }
//     }
//   }
// }