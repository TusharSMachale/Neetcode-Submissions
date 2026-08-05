class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0;
        int max = 0;
        for(int n : nums){
            if(n == 1){
                curr++;
                max = Math.max(max, curr);
            }else{
                curr = 0;
            }
        }
        return max;
    }
}