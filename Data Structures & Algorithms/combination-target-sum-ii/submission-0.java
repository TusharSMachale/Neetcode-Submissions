class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, result, new ArrayList<>());
        return result;
    }

    public void backtrack(int[] nums, int target, int start, List<List<Integer>> result, List<Integer> curr){

        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=start; i<nums.length; i++){
            if(nums[i] > target) break;

            if(i > start && nums[i] == nums[i-1]) continue;

            curr.add(nums[i]);

            backtrack(nums, target-nums[i], i+1, result, curr);

            curr.remove(curr.size()-1);
        }
    }
}
