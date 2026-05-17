class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        
        int left = 0;
        int right = n-1;

        while(left <= right)
        {
            int center = left + (right - left)/2;
            if(nums[center] == target) return center;
            else if(nums[center] > target)
            {
                right = center-1;
            }
            else left = center+1;
        }

        return -1;
    }
}
