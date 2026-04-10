class Solution {
    public String maximumOddBinaryNumber(String s) {
        if(s.length() == 1){
            return s;
        }
        int one = 0;
        int zero = 0;
        char[] ch = s.toCharArray();
        for(char c : ch){
            if( c == '1'){
                one++;
            }else if(c == '0'){
                zero++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(one > 1){
            sb.append("1");
            one--;
        }
        while(zero > 0){
            sb.append("0");
            zero--;
        }
        while(one == 1){
            sb.append("1");
            one--;
        }

        return sb.toString();

    }
}