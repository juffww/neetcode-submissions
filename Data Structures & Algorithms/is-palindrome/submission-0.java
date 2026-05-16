class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right)
        {
            char c1 = Character.toLowerCase(s.charAt(left));
            char c2 = Character.toLowerCase(s.charAt(right));

            if(c1 < '0' || (c1 > '9' && c1 < 'a') || c1 > 'z') {
                left++;
                continue;
            }
            if(c2 < '0' || (c2 > '9' && c2 < 'a') || c2 > 'z') {
                right--;
                continue;
            }

            if(c1 != c2) return false;
            left++;
            right--;
        }

        return true;
    }
}
