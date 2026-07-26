class Solution { 
    public List<List<Integer>> subsets(int[] nums) { 
        List<List<Integer>> ans = new ArrayList<>(); 
        backtrack(nums, 0, new ArrayList<>(), ans); 
        return ans; 
    } 

    public void backtrack(int[] nums, int ind, ArrayList<Integer> curr, List<List<Integer>> ans){ 
        // Base case: always add a snapshot copy of curr at each step
        ans.add(new ArrayList<>(curr)); 

        for (int i = ind; i < nums.length; i++) {
            // Include the element
            curr.add(nums[i]); 
            // Move to the next element
            backtrack(nums, i + 1, curr, ans); 
            // Backtrack: remove the element
            curr.remove(curr.size() - 1); 
        }
    } 
}
