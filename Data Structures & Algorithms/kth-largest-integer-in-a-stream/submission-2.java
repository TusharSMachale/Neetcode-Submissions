class KthLargest {
    int k;
    PriorityQueue<Integer> min;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.min = new PriorityQueue<>();
        for(int n : nums){
            min.offer(n);
            if(min.size() > k){
                min.poll();
            }
        }
    }
    
    public int add(int val) {
        min.offer(val);
        if(min.size() > k){
            min.poll();
        }
        return min.peek();
    }
}
