import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    
    /* 
      Initialise a Map to hold:
      - Keys: Items in `nums`
      - Values: Largest index containing `nums` item

      This allows me to look up keys in O(1).
    */
    HashMap<Integer, Integer> visitedNumIndices = new HashMap<>();

    // Iterate through `nums`
    for (int index = 0; index < nums.length; index++) {
      // Populate Map
      visitedNumIndices.put(nums[index], index);
      /*
        If two of the same num exist in `nums` the stored 
        index will be overwritten.

        This prevents issues where the ints that add up 
        to `target` are the same number.
        If the index is not overwritten, then I'd have no 
        way of knowing if 2+ of the same number exist in 
        `nums`
      */
    };


    // Iterate through `nums`
    for (int index = 0; index < nums.length; index++) {
      // Calculate the second int needed to reach `target`
      int desiredNum = target - nums[index];

      // Get the index of the desired num from Map
      int desiredNumIndex = visitedNumIndices.getOrDefault(desiredNum, -1);

      // Check if `desiredNum` is not a key in Map
      if (desiredNumIndex == -1) continue;

      // Check if `desiredNumIndex` is not the current `index`
      if (desiredNumIndex == index) continue;

      // Return the answer
      return new int[]{index, desiredNumIndex};
    };

    // If no answer exists
    return new int[]{-1, -1};
  }
}