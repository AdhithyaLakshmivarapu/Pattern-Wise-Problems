package Hashing;
import java.util.*;
/*
- LeetCode 1. Two Sum
- Pattern: HashMap
- Difficulty: Easy
-
- Problem:
- Given an array of integers and a target, find two numbers that add up to the target.
- Return their indices.
-
- Approach:
- Use a HashMap to store each number along with its index while traversing the array.
- For each number, calculate the value needed to reach the target.
- If the required value already exists in the map, return its stored index and the current index.
- Otherwise, store the current number and its index in the map.
-
- Time Complexity: O(n)
- Space Complexity: O(n)
-
- Key Learning:
- A HashMap can provide constant-time lookup for the required complement.
- This avoids the O(n²) brute-force pair search.
*/

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int need = target - nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need), i};
            }else{
                map.put(nums[i],i);
            }


        }
        return new int[]{};


    }
}