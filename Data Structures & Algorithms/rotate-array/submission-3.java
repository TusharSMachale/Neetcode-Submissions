class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int j=n-1;
        k = k%n;
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        int m = 0;
        int o = k-1;
        while(m <= o){
            int temp1 = nums[m];
            nums[m] = nums[o];
            nums[o] = temp1;
            m++;
            o--;
        }
        int u = k;
        int v = n-1;
        while(u <= v){
            int temp1 = nums[u];
            nums[u] = nums[v];
            nums[v] = temp1;
            u++;
            v--;
        }
    }
}