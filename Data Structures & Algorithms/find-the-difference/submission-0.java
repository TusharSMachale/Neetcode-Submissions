class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            sum1 += ch;
        }
        for(int j=0; j<t.length(); j++){
            char cha = t.charAt(j);
            sum2 += cha;
        }
        int temp = sum2 - sum1;
        return (char)temp;
    }
}