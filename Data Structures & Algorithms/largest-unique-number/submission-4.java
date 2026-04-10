class Solution {
    public int largestUniqueNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int i = nums.length-1;
        while(i >= 0){
            if(i == 0){
                return nums[0];
            }
            if(nums[i] == nums[i-1]){
                i-=2;
            }else if(nums[i] != nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
}
