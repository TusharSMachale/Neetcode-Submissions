class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i = 0;
        int count = 0;
        int ans = 0;

        for(int j=0; j<nums.length; j++){
            if(nums[j] == 0){
                count++;
            }
            if(count < 2){
                ans ++;
                max = Math.max(max, ans);
            }else{
                while(count > 1){
                    if(nums[i] == 0){
                        count--;
                    }
                    i++;
                    ans -= 1;
                }
                max = Math.max(max, ans);
            }
        }
        return max;
    }
}
