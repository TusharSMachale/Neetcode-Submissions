class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();;
        int l = 0;
        int r = arr.length-1;

        while(r-l >= k){
            int left = Math.abs(x - arr[l]);
            int right = Math.abs(x - arr[r]);

            if(left > right){
                l++;
            }else{
                r--;
            }
        }
        for(int i=l; i<=r; i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}