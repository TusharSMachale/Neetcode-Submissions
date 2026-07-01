class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int j = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        
        // 1. Process the first window of size k
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }
        
        // 2. Slide the window across the rest of the array
        for (int i = k; i < n; i++) {
            ans[j++] = nums[dq.peekFirst()]; // Record max of previous window
            
            // Remove indices that fell out of the left side of the window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            
            // Remove smaller elements from the back
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }
        
        // 3. Record the maximum for the final window
        ans[j] = nums[dq.peekFirst()];
        return ans;
    }
}
