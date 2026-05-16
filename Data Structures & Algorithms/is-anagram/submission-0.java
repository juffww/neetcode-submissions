class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int n = s.length();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(c1 == c2) continue;

            if(map1.containsKey(c1)) map1.replace(c1, map1.get(c1) + 1);
            else map1.put(c1, 1);

            if(map2.containsKey(c2)) map2.replace(c2, map2.get(c2) + 1);
            else map2.put(c2, 1);
        }

        return map1.equals(map2);
    }
}
