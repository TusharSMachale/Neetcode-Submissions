class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0;
        int count = 0;
        int sum = 0;

        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        if(sum >= k * threshold){
            count++;
        }
        
        for(int r=k; r<arr.length; r++){
            sum -= arr[l++];
            sum += arr[r];
            if(sum >= k * threshold){
                count++;
            }
        }
        return count;
    }
}