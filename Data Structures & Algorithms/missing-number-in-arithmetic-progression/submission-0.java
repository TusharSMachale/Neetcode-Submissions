class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n-1;
        int dif = (arr[n-1] - arr[0]) / n;
        int mid = 0;
        while(l < r){
            mid = (l + (r-l)/2);
            if(arr[mid] == arr[0] + mid * dif){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return arr[l] - dif;

    }
}
