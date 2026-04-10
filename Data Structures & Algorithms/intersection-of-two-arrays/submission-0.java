class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums1){
            set.add(n);
        }

        Set<Integer> res = new HashSet<>();
        for(int a : nums2){
            if(set.contains(a)){
                res.add(a);
            }
        }
        int[] ans = new int[res.size()];
        int i = 0;
        for(int b : res){
            ans[i++] = b;
        }
        return ans;
    }
}