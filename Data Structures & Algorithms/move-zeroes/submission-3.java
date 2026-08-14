class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int i = 0;
        int n = nums.length;
        while(i < n){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                i++;
                l++; 
            }else{
                i++;
            }
        }
    }
}