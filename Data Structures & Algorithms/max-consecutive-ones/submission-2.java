class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;
        int r = 0;
        while(r < nums.length){
            if(nums[r] == 1){
                curr++;
                max = Math.max(max, curr);
            }else{
                curr = 0;
            }
            r++;
        }
        return max;
    }
}