class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curr = 0;
        int min = Integer.MAX_VALUE;
        int l = 0;

        for(int i=0; i<nums.length; i++){
            curr += nums[i];
            while(curr >= target){
                min = Math.min(min, i-l+1);
                curr -= nums[l];
                l++;
                
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}