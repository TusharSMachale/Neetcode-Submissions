class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        int j = 0;
        for(int i=0; i<t.length(); i++){
            if(j == s.length()){
                break;
            }
            char ch1 = s.charAt(j);
            char ch2 = t.charAt(i);

            if(ch1 == ch2){
                j++;
            }

        }
        return j == s.length();
    }
}