/*
- LeetCode 169. Majority Element
- Pattern: Boyer-Moore Voting Algorithm
- Difficulty: Easy
-
- Problem:
- Given an array nums, return the majority element that appears more than n/2 times.
- If no such element exists, return -1.
-
- Approach:
- Use a candidate element e and a count c to find the potential majority element.
- Increase the count when the current number matches e and decrease it otherwise.
- After finding the candidate, count its actual frequency in a second pass.
- Return e only if its frequency is greater than nums.length/2.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
-
- Key Learning:
- Boyer-Moore Voting Algorithm finds a potential majority element using constant space.
- A second pass verifies whether the candidate actually appears more than n/2 times.
*/

public class MajorityElement {

    public int majorityElement(int[] nums) {

        int e = 0;

        int c = 0;

        for(int num: nums){

            if(e==0){

                e= num;

                c=1;

            }else if(num==e){

                c++;

            }

            else{

                c--;

            }

        }

        int freq = 0;

        for(int num:nums){

            if(num==e){

                freq++;

            }

        }

        return freq>nums.length/2?e:-1;

    }

}