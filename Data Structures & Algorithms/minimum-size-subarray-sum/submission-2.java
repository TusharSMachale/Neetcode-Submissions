class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int n = nums.length;
        int curr = 0;
        int min = Integer.MAX_VALUE;

        for(int r = 0; r< n; r++){
            curr += nums[r];
            while(curr >= target){
                min = Math.min(min, r-l+1);
                curr -= nums[l];
                l++;
            }
        } 
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}