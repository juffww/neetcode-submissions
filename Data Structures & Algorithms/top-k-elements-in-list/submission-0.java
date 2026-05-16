class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)) map.replace(num, map.get(num) + 1);
            else map.put(num, 1);
        }

        //convert hashmap to list for sorting
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        //Sort
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] res = new int[k];

        for(int i = 0; i < k; i++)
        {
            // key: value in nums
            // value: frequency
            res[i] = list.get(i).getKey();
        }

        return res;
    }
}
