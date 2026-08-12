/*
- LeetCode 75. Sort Colors
- Pattern: Two Pointers / Dutch National Flag
- Difficulty: Medium
-
- Problem:
- Given an array containing 0, 1, and 2, sort the array in-place so that objects
- of the same color are adjacent, in the order 0, 1, and 2.
-
- Approach:
- Use three pointers: low, mid, and high to divide the array into three regions.
- When nums[mid] is 0, swap it with nums[low] and move both low and mid forward.
- When nums[mid] is 1, move mid forward.
- When nums[mid] is 2, swap it with nums[high] and move high backward.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
-
- Key Learning:
- The Dutch National Flag algorithm uses three pointers to partition an array
- into three sections in a single pass.
*/

public class SortColors {

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]= nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }else if (nums[mid]==1){
                mid++;
            }else{
                int temp = nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
}