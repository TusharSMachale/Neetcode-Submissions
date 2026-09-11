class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int l = 0;
        int i = 0;

        while(i < n){
            if(nums[i] != nums[l]){
                l++;
                nums[l] = nums[i];
            }
            i++;
        }
        return l+1;
    }
}