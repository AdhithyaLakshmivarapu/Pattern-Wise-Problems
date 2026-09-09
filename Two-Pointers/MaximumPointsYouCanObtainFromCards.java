/*
- LeetCode 1423. Maximum Points You Can Obtain from Cards
- Pattern: Sliding Window / Two Pointers
- Difficulty: Medium
-
- Problem:
- You have cards arranged in a row. You can take exactly k cards from either
- the beginning or the end. Return the maximum score possible.
-
- Approach:
- First calculate the sum of the first k cards.
- Then gradually remove cards from the left side and add cards from the right side.
- Track the maximum sum obtained from every possible combination.
-
- Time Complexity: O(k)
- Space Complexity: O(1)
-
- Key Learning:
- A combination of prefix and suffix elements can be explored efficiently by
- shifting the selection from the left side toward the right side.
*/

public class MaximumPointsYouCanObtainFromCards {

    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int n = cardPoints.length-1;
        for(int i=0;i<k;i++){
            sum=sum+cardPoints[i];
        }
        int maxsum=sum;
        int rsum = sum;
        int counter = n;
        int lsum = 0;
        for(int i = k-1; i>=0;i--){
            int rindex=n-1;
            rsum=rsum-cardPoints[i];
            lsum=lsum+cardPoints[counter];
            counter--;
            maxsum= Math.max(maxsum, rsum+lsum);

        }
        return maxsum;
    }
}