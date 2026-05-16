

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int windowSize = s1.length();
        int n2 = s2.length();

        int[] need = new int[26];
        int[] window = new int [26];
        
        for(int i = 0; i < windowSize; i++)
        {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        // if need is empty or in the first window, it match
        if(Arrays.equals(need, window)) return true;

        // already loop from i = 0 to windowSize above
        for(int right = windowSize; right < n2; right++)
        {
            char addChar = s2.charAt(right);
            window[addChar - 'a']++;

            char removeChar = s2.charAt(right - windowSize);
            window[removeChar - 'a']--;

            if(Arrays.equals(need, window)) return true;
        }   
        return false;
    }
}
