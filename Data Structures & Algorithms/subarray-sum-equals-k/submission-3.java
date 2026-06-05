class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int res = 0;
        for(int num : nums){
            sum += num;
            int dif = sum - k;
            if(map.containsKey(dif)){
                res += map.get(dif);
            }
            map.put(sum,map.getOrDefault(sum,0) + 1);
        }
        return res;
    }
}