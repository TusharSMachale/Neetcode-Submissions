
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;

            // Compare mid with its pair: even -> mid+1, odd -> mid-1
            if (nums[mid] == nums[mid ^ 1]) {
                l = mid + 1;   // pairs hold up to mid; single is to the right
            } else {
                r = mid;       // pairing breaks at/left of mid
            }
        }
        return nums[l];
    }
}

