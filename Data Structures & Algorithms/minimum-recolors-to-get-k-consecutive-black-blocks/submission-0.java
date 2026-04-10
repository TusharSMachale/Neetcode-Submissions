class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int i = 0;
        int j = k-1;
        // int a = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        while(j < n){
            for(int a = i; a<=j; a++){
                if(blocks.charAt(a) == 'W'){
                    count++;
                }
            }
            min = Math.min(min, count);
            count = 0;
            i++;
            j++;
        }
        return min;
    }
}