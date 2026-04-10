class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int temp = nums[0];
        int max = 1;
        for(int i=1; i<n; i++){
            if(nums[i] == temp){
                max++;
            }else{
                max--;
                if(max == -1){
                    temp = nums[i];
                    max = 1;
                }
            }
        }
        return temp;
    }
}