class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int pivot = -1;
        for(int i=n-2; i>=0 ; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i=n-1; i>pivot; i--){
            if(nums[i] > nums[pivot]){
                swap(nums, pivot, i);
                reverse(nums, pivot+1, n-1);
            }
        }

        
    }
    private static void reverse(int[] nums, int l, int r){
            while(l < r){
                swap(nums, l, r);
                l++;
                r--;
            }
        }

    private static void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}