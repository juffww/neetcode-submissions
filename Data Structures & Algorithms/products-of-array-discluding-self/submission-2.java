class Solution {
    public int[] productExceptSelf(int[] nums) {
        long product = 1;
        int count0 = 0;
        for(int value : nums)
        {
            if(value == 0) 
            {
                count0++;
                continue;
            }
            product *= value;
        }

        int n = nums.length;

        int[] output = new int[n];

        if(count0 > 1) return output;

        for(int i = 0; i < n; i++)
        {
            if(count0 == 1)
            {
                if(nums[i] == 0) output[i] = (int)product;
                else output[i] = 0;
            }
            else output[i] = (int)product/nums[i];
        }

        return output;
    }
}  
