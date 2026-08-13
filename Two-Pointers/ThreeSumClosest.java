/*
- LeetCode 16. 3Sum Closest
- Pattern: Sorting + Two Pointers
- Difficulty: Medium
-
- Problem:
- Given an integer array and a target, find three integers whose sum is closest
- to the target and return the sum of those three integers.
-
- Approach:
- Sort the array and fix one element using the outer loop.
- Use two pointers, left and right, to find the remaining two elements.
- Track the sum with the smallest difference from the target.
- Move left when the sum is smaller than the target and right when it is larger.
-
- Time Complexity: O(n^2)
- Space Complexity: O(log n)
-
- Key Learning:
- Sorting combined with two pointers can reduce a three-element search from
- O(n^3) to O(n^2).
*/

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int ss = Integer.MAX_VALUE;
        int osum = 0;
        Arrays.sort(nums);
        for(int i =0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target) <= Math.abs(ss) ){
                    ss= sum-target;
                    osum = sum;
                }
                if(sum==target){
                    return sum;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
                
            }

   
        }
         return osum; 
    }
}