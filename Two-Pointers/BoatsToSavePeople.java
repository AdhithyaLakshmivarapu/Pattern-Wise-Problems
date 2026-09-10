/*
- LeetCode 881. Boats to Save People
- Pattern: Sorting + Two Pointers
- Difficulty: Medium
-
- Problem:
- Given an array of people's weights and a boat weight limit, each boat can carry
- at most two people. Return the minimum number of boats needed to rescue everyone.
-
- Approach:
- Sort the people by their weights and use two pointers from both ends.
- If the lightest and heaviest people can fit together, place them in the same boat.
- Otherwise, the heaviest person must take a boat alone.
- Count the boats until all people are assigned.
-
- Time Complexity: O(n log n)
- Space Complexity: O(log n)
-
- Key Learning:
- Sorting allows the two-pointer technique to greedily pair the heaviest person
- with the lightest possible person.
*/

public class BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int left = 0;
        int right = n-1;
        int count=0;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                count++;
                left++;
                right--;

            }else if(people[left]+ people[right]>limit){
                right--;
                count++;
            }
        }
        return count;
    }
}