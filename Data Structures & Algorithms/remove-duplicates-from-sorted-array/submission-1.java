class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        int j = 1;
        while(j < n){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i+1;
    }
}