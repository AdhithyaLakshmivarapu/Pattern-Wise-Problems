/*
- LeetCode 11. Container With Most Water
- Pattern: Two Pointers
- Difficulty: Medium
-
- Problem:
- Find two lines that, together with the x-axis, form a container that holds the most water.
-
- Approach:
- Use two pointers at the leftmost and rightmost positions.
- Calculate the area using the shorter of the two heights and the distance between them.
- Move the pointer with the smaller height inward to search for a potentially larger area.
- Continue until the two pointers meet.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
-
- Key Learning:
- In the Container With Most Water problem, the limiting factor is the shorter height.
- Moving the taller pointer cannot increase the area, so the shorter pointer is moved.
*/

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int area = 0;
        while(l<r){
            int min = Math.min(height[l],height[r]);
            int tarea = ((r-l)) * min;
            if(tarea> area){
                area = tarea;
            }
            if(height[l]>height[r]){
                r--;
            }else if(height[l]<height[r]){
                l++;
            }else{
                l++;
                r--;
            }
        }
        return area;
    }
}