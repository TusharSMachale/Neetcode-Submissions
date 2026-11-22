class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];
        String c = "";
        int limit = Math.min(a.length(),b.length());
        for(int i=0; i<limit; i++){
            if(a.charAt(i) == b.charAt(i)){
                c += a.charAt(i);
            }else{
                break;
            }
        } 
        return c;
    }
}