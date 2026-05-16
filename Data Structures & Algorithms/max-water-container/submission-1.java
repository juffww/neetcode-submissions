class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int n = heights.length;
        
        int left = 0;
        int right = n-1;

        while(left < right)
        {
            int height = Math.min(heights[left], heights[right]);
            int weight = right - left;

            int area = height * weight;

            if(heights[left] < heights[right])
            {
                left++;
            }
            else right--;

            if(max < area) max = area;
        }

        return max;
    }
}
