class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);

        int len = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++)
        {
            int diff = nums[i] - nums[i-1];
            if(diff == 1)
            {
                len++;
            }else if(diff == 0)
            {
                continue;
            } else {
                len = 1;
            }

            if(max < len) max = len;
        }

        return max;
    }
}
