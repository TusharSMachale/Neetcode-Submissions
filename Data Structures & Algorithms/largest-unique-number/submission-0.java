class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                max = Math.max(max, key);
            }
        }
        return max == Integer.MIN_VALUE ? -1 : max;
    }
}
