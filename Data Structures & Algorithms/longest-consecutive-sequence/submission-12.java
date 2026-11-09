class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int curr = 0;
        int max = 0;
        for(int a : nums){
            if(!set.contains(a-1)){
                curr = 1;
                while(set.contains(a+curr)){
                    curr++;
                }
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}
