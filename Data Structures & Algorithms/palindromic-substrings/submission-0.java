class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int len = 0;
        for(int i=0; i<n; i++){
            // odd
            int a = i;
            int b = i;
            while(a >= 0 && b <= n-1 && s.charAt(a) == s.charAt(b)){
                len++;
                a--;
                b++;
            }

            //even
            int l = i;
            int r = i+1;
            while(l >= 0 && r <= n-1 && s.charAt(l) == s.charAt(r)){
                len++;
                l--;
                r++;
            }
        }
        return len;
    }
}
