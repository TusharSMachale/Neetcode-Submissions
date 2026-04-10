class Solution {
    public boolean isOneEditDistance(String s, String t) {
        if(s.equals(t)){
            return false;
        }
        int ns = s.length();
        int nt = t.length();
        if(Math.abs(ns - nt) > 1){
            return false;
        }
        if(ns > nt) return isOneEditDistance(t, s);

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != t.charAt(i)){
                if(ns == nt){
                    return s.substring(i+1).equals(t.substring(i+1));
                }else{
                    return s.substring(i).equals(t.substring(i+1));
                }
            }
        }
        return ns + 1 == nt;
    }
}
