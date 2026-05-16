class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int maxFrequency = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;

        for(int right = 0; right < n; right++)
        {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            maxFrequency = Math.max(maxFrequency, map.get(c));
            int lenSubstring = right - left + 1;
            int numberNeedToReplace = lenSubstring - maxFrequency;

            while(numberNeedToReplace > k)
            {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;

                lenSubstring = right - left + 1;
                numberNeedToReplace = lenSubstring - maxFrequency;
            }

            max = Math.max(max, lenSubstring);
        }

        return max;
    }
}