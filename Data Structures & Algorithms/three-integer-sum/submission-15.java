class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(nums == null || n < 3) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int l = i+1;
            int r = n-1;
            while(l < r){
                long sum = (long)nums[i] + nums[l] + nums[r];
                if( sum == 0){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[l]);
                    res.add(nums[r]);
                    ans.add(res);
                    while(l < r && nums[l] == nums[l+1]){
                        l++;
                    }
                    while(l < r && nums[r] == nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }else if(sum < 0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return ans;
    }
}
