class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        long prod = 1;
        int i = 0;

        for(int j=0; j<nums.length; j++){
            prod *= nums[j];
            while(i <= j && prod >= k){
                prod /= nums[i++];
            }
            count += j-i+1;
        }
        return count; 
    }
}