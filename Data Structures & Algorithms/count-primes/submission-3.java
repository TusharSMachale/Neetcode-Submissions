class Solution {
    public int countPrimes(int n) {
        if(n <= 2){
            return 0;
        }
        int count = n/2;
        boolean[] prime = new boolean[n];

        for(int i=3; i*i<n; i+=2){
            if(!prime[i]){
                for(int j=i*i; j<n; j+=2*i){
                    if(!prime[j]){
                        prime[j] = true;
                        count--;
                    }
                }
            }
        }
        return count;
        
    }
}