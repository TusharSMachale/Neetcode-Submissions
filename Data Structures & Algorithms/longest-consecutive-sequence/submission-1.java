class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int count = 0;
        int max = 0;
        for(int n : nums){
            if(!set.contains(n-1)){
                count = 1;
                for(int i=1; i < nums.length; i++){
                    if(set.contains(n + i)){
                        count++;
                    }else{
                        break;
                    }
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
