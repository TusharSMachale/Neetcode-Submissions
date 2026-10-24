class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual_sum = (n*(n+1))/2;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum == actual_sum){
            return 0;
        }else{
            return actual_sum - sum;
        }
    }
}
