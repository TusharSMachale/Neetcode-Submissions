class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int j=0; j<n; j++){
            // sum += nums[j];
            sum = Math.max(sum + nums[j], nums[j]);
            max = Math.max(sum, max);
        }
        return max;
    }
}
