class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int max = 0;
        Set<Character> seen = new HashSet();
        for(int right=0; right<n; right++){
            char c = s.charAt(right);
            while(seen.contains(c)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(c);
            max = Math.max(max,right-left+1);
        }

        return max;
    }
}
