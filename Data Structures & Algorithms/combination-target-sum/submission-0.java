class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, target, 0, result, new ArrayList<>());
        return result;

    }

    public void backtrack(int[] nums, int target, int start, List<List<Integer>> result, List<Integer> curr){

        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=start; i<nums.length; i++){
            if(nums[i] > target) break;

            curr.add(nums[i]);

            backtrack(nums, target-nums[i], i, result, curr);

            curr.remove(curr.size()-1);
        }
    }
}
