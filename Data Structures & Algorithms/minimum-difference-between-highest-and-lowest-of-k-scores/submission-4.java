class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 1){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int i = 0;
        int j = k-1;
        while(j < nums.length){
            int diff = nums[j] - nums[i];
            min = Math.min(min, diff);
            i++;
            j++;
        }
        return min;
    }
}