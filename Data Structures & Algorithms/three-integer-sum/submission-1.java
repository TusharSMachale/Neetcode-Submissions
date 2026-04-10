class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();
        if(nums.length < 3 || nums == null){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
