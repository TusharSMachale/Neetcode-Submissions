class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int[] ans = new int[n];
        int i = n-1;

        while(l <= h){
            if(Math.abs(nums[l]) >= Math.abs(nums[h])){
                ans[i] = nums[l] * nums[l];
                l++;
            }else{
                ans[i] = nums[h]*nums[h];
                h--;
            }
            i--;
        }
        return ans;
    }
}