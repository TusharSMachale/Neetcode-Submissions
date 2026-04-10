class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            char ch = s[low];
            s[low] = s[high];
            s[high] = ch;
            low++;
            high--;
        }
    }
}