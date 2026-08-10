/*
- LeetCode 167. Two Sum II - Input Array Is Sorted
- Pattern: Two Pointers
- Difficulty: Medium
-
- Problem:
- Given a 1-indexed sorted array, find two numbers that add up to the target.
- Return their 1-based indices.
-
- Approach:
- Use two pointers, one at the beginning and one at the end of the array.
- If the sum is less than the target, move the left pointer forward.
- If the sum is greater than the target, move the right pointer backward.
- When the sum equals the target, return the 1-based indices.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
-
- Key Learning:
- In a sorted array, two pointers can efficiently narrow down the search space.
- When the sum is too small, move left; when it is too large, move right.
*/

public class TwoSumii {

    public int[] twoSum(int[] numbers, int target) {

        int l =0;

        int r = numbers.length-1;

        while(l<r){

            if(numbers[l]+numbers[r]<target){

                l++;

            }else if(numbers[l]+numbers[r]>target){

                r--;

            }else{

                return new int[]{l+1,r+1};

            }

        }

        return new int[]{};

    }

}