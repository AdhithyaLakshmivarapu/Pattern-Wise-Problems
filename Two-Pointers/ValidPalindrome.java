/*
- LeetCode 125. Valid Palindrome
- Pattern: Two Pointers
- Difficulty: Easy
-
- Problem:
- Determine whether a string is a palindrome after converting uppercase letters to lowercase
- and removing all non-alphanumeric characters.
-
- Approach:
- Use two pointers starting from both ends of the string.
- Skip characters that are not letters or digits.
- Compare the lowercase versions of the valid characters.
- Move both pointers inward when the characters match.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
-
- Key Learning:
- Two pointers can efficiently compare characters from opposite ends.
- Character.isLetterOrDigit() and Character.toLowerCase() allow the comparison
- without creating a modified copy of the string.
*/

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int i =0;
        int j = s.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }else if(Character.toLowerCase(s.charAt(i)) !=  Character.toLowerCase(s.charAt(j))){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }

}