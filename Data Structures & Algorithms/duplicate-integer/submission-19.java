class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        Set<Integer> res = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            // if(nums[i] == nums[i+1]){
            //     return true;
            // }
           if(res.contains(nums[i])){
            return true;
           } 
           else{
            res.add(nums[i]);
           }
        }
        return false;
        
    }
}