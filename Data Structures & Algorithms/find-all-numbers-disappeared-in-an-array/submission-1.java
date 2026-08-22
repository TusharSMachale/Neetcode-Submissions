class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int a = Math.abs(nums[i]); 
            if (nums[a - 1] > 0) {
                nums[a - 1] = -nums[a - 1];
            }
        }
        
        // 2. Identify missing numbers
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > 0) { 
                ans.add(j + 1);
            }
        }
        
        return ans;
    }
}
