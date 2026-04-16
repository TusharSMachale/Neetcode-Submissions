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
                
                while(set.contains(n + count)){
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
