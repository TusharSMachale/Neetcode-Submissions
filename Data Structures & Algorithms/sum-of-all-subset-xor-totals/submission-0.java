class Solution {
    private int dfs(int[] nums, int i, int total){
        if(i == nums.length){
            return total;
        }
        return dfs(nums, i+1, total ^ nums[i]) + dfs(nums, i+1, total);
    }
    public int subsetXORSum(int[] nums) {
        int i = 0;
        int total = 0;
        return dfs(nums, i, total);
    }
}