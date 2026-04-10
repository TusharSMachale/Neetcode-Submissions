class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int n = nums.length;
        int a = first(nums, target);
        int b = last(nums, target);
        if(a == -1 || b == -1){
            return false;
        }
        int ans = b - a + 1;
        return (ans > n/2) ? true : false;

    }
    public int first(int[] num, int t){
        int l = 0;
        int r = num.length-1;
        int res = -1;
        int mid = 0;
        while(l <= r){
            mid = l + (r-l)/2;
            if(num[mid] == t){
                res = mid;
                r = mid - 1;  
            }else if(num[mid] < t){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return res;
    }
    public int last(int[] num, int t){
        int l = 0;
        int r = num.length-1;
        int res = -1;
        int mid = 0;
        while(l <= r){
            mid = l + (r-l)/2;
            if(num[mid] == t){
                res = mid;
                l = mid + 1;  
            }else if(num[mid] < t){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return res;
    }
    
}
