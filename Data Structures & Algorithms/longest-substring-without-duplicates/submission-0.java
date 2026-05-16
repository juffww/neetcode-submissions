class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        int n = s.length();

        int left = 0;

        for(int right = 0; right < n; right++)
        {
            char c = s.charAt(right);

            while(set.contains(c))
            {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
