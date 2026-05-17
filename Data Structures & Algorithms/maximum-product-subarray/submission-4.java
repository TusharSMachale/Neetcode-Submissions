class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for(int i=1; i<nums.length; i++){
            int a = nums[i];

            if(a < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(a, max * a);
            min = Math.min(a, min * a);

            result = Math.max(max, result);
        }
        return result;
    }
}
