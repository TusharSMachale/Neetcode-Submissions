class Solution {
    public void reverseWords(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(i <= j){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }
        int a = 0;
        int b = 0;
        int c = 0;
        while(c < s.length){
                if(s[c] == ' '){
                    b = c-1;
                    while(a <= b){                
                        char ch = s[a];
                        s[a] = s[b];
                        s[b] = ch;
                        a++;
                        b--;
                    }
                    c++;
                    a = c;
                    b = c;
                }
                if(c == s.length-1){
                    b = c;
                    while(a <= b){                
                        char ch = s[a];
                        s[a] = s[b];
                        s[b] = ch;
                        a++;
                        b--;
                    }
                    c++;
                    a = c;
                    b = c;
                }
                c++;
                           
        }
    }
}
