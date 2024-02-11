package Maps;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndexMap.containsKey(complement)) {
                return new int[]{numToIndexMap.get(complement), i};
            }
            numToIndexMap.put(nums[i], i);
        }

        return new int[]{-1, -1}; // No solution found
    }
}
