class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int a = Math.abs(nums[i]) - 1;
            if(nums[a] < 0){
                return a + 1;
            }else{
                nums[a] = -nums[a];
            }
        }
        return -1;
    }
}
