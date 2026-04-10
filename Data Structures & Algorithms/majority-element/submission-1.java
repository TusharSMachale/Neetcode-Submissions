class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 1;
        int ans = nums[0];
        for(int i=1; i<n; i++){
            if(ans == nums[i]){
                count++;
            }else{
                count--;
                if(count == 0){
                    ans = nums[i];
                    count = 1;
                }
            }
        }
        return ans;
    }
}