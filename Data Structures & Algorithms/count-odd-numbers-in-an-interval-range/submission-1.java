class Solution {
    public int countOdds(int low, int high) {
        if(low == high){
            if(low % 2 == 0){
                return 0;
            }    
            else{
                return 1;
            } 
        }
        return (high - low)/2 + 1;
    }
}