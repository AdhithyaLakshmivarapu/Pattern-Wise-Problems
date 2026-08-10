/*
- LeetCode 26. Remove Duplicates from Sorted Array
- Pattern: Two Pointers
- Difficulty: Easy
-
- Problem:
- Given a sorted array, remove duplicates in-place so each unique element appears only once.
- Return the number of unique elements.
-
- Approach:
- Use two pointers where i tracks the position of the last unique element.
- Move j through the array and compare each element with nums[i].
- When a new unique element is found, place it at nums[i+1] and move i forward.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
-
- Key Learning:
- Two pointers can be used to modify a sorted array in-place.
- One pointer tracks the position of the last valid element while the other scans the array.
*/

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i =0;
        int j;
        for(j=i+1 ;j<n;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }

}