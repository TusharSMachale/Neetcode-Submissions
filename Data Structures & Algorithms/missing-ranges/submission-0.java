class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> ans = new ArrayList<>();
        int prev = lower - 1;
        for(int i=0; i<=nums.length; i++){
            int curr = i == nums.length ? upper+1 : nums[i];
            if(curr - prev >= 2){
                ans.add(Arrays.asList(prev+1,curr-1));
            }
            prev = curr;
        }
        return ans;
    }
}
