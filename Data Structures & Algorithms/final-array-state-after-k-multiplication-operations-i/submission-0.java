class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> min = new PriorityQueue<>((a,b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        for(int i=0; i<nums.length; i++){
            min.offer(new int[]{nums[i],i});
        }
        for(int j=0; j<k; j++){
            int[] a = min.poll();
            int n = a[0] * multiplier;
            nums[a[1]] = n;
            min.offer(new int[]{n, a[1]});
        }
        return nums;  
    }
}