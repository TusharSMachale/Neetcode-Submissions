class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int i = 0; 
        int j = n-1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        int a = 0;
        int b = k-1;
        while(a < b){
            int t = nums[a];
            nums[a] = nums[b];
            nums[b] = t;
            a++;
            b--;
        }

        int u = k;
        int v = n-1;
        while(u < v){
            int tem = nums[u];
            nums[u] = nums[v];
            nums[v] = tem;
            u++;
            v--;
        }
    }
}