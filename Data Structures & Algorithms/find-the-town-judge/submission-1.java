class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n+1];
        for(int[] num : trust){
            score[num[0]]--;
            score[num[1]]++;
        }
        for(int i=1; i<score.length; i++){
            if(score[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}