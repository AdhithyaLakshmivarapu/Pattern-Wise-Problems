/*
- LeetCode 283. Move Zeroes
- Pattern: Two Pointers
- Difficulty: Easy
-
- Problem:
- Move all zeroes to the end of the array while maintaining the relative order
- of the non-zero elements.
-
- Approach:
- Use i to scan through the array and j to track the position for the next non-zero element.
- When a non-zero element is found, swap nums[i] with nums[j].
- Increment j after placing the non-zero element in its correct position.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
-
- Key Learning:
- Two pointers can partition an array in-place while preserving the relative order
- of the elements that need to remain.
*/

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int j =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]= temp;
                j++;
            }
        }
    }
}