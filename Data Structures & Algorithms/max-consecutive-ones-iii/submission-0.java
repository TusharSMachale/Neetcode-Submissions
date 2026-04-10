class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int count = 0;
        int ans = 0;
        int i = 0;
        
        for(int j=0; j<nums.length; j++){
            if(nums[j] == 0){
                count++;
            }
            if(count <= k){
                ans++;
                max = Math.max(max, ans);
            }else{
                while(count > k){
                    if(nums[i] == 0){
                        count--;
                    }
                    ans--;
                    i++;
                    max = Math.max(max, ans);
                }
                ans++;
                max = Math.max(max, ans);

            }
        }
        return max;
    }
}