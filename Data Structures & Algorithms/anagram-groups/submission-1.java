class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        // key: String -> the sorted Strign
        // value: List -> all the original String

        for(String str : strs)
        {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);
            if(map.containsKey(sortedString)) map.get(sortedString).add(str);
            else 
            {
                List<String> valueString = new ArrayList<>();
                valueString.add(str);
                map.put(sortedString, valueString);
            }
        }
        return new ArrayList<>(map.values());
    }
}
