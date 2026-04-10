class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        k = k%n;
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        int a = 0;
        int b = k-1;
        while(a<=b){
            int t = nums[a];
            nums[a] = nums[b];
            nums[b] = t;
            a++;
            b--;
        }
        int c = k;
        int d = n-1;
        while(c<=d){
            int te = nums[c];
            nums[c] = nums[d];
            nums[d] = te;
            c++;
            d--;
        }
    }
}