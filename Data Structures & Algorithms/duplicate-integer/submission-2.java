class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> temp = new HashSet<>();

        for(int value : nums)
        {
            if(temp.contains(value)) return true;
            else temp.add(value);
        }
        return false;
    }
}