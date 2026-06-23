class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int reslen = 0;
        int res = 0;

        for(int i=0; i<n; i++){

            // odd
            int a = i;
            int b = i;
            while(a >= 0 && b <= n-1 && s.charAt(a) == s.charAt(b)){
                if(b - a + 1 > reslen){
                    reslen = b - a + 1;
                    res = a;
                }
                a--;
                b++;
            }                    
            

            // even
            int l = i;
            int r = i+1;
            while(l >= 0 && r <= n-1 && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > reslen){
                    reslen = r - l + 1;
                    res = l;
                }
                l--;
                r++;
            }
                
        }
        return s.substring(res, res + reslen);
    }
}
