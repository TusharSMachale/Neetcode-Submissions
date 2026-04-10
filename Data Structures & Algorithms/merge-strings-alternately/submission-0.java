class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int l = 0;
        int r = 0;
        while(l < n1 && r < n2){
            sb.append(word1.charAt(l));
            l++;
            sb.append(word2.charAt(r));
            r++;
        }
        if(l >= n1){
            while(r < n2){
                sb.append(word2.charAt(r));
                r++;
            }
        }else{
            while(l < n1){
                sb.append(word1.charAt(l));
                l++;
            }
        }
        return sb.toString();

    }
}