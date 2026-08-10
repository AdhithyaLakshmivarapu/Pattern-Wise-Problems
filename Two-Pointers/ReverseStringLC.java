/*
- LeetCode 344. Reverse String
- Pattern: Two Pointers
- Difficulty: Easy
-
- Problem:
- Reverse the input character array in-place.
-
- Approach:
- Use two pointers starting from the beginning and end of the array.
- Swap the characters at both pointers.
- Move both pointers toward the center until they meet.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
-
- Key Learning:
- Two pointers can reverse an array in-place without using extra space.
- The pointers move symmetrically toward the center after each swap.
*/

public class ReverseStringLC {

    public void reverseString(char[] s) {

        int i =0;

        int j =s.length-1;

        while(i<j){

            char temp =s[i];

            s[i] = s[j];

            s[j]=temp;

            i++;

            j--;

        }

    }

}   

