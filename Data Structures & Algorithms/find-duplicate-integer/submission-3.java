class Solution {
    public int findDuplicate(int[] nums) {
        for(int num : nums){
            int a = Math.abs(num);
            if(nums[a] < 0){
                return a;
            }else{
                nums[a] = -nums[a];
            }
        }
        return -1;
    }
}
