class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : stones){
            maxheap.add(n);
        }
        while(maxheap.size() > 1){
            int a = maxheap.poll();
            int b = maxheap.poll();
            if(a != b){
                maxheap.add(Math.abs(b-a));
            }
        }
        return (maxheap.size() == 1) ? maxheap.poll() : 0;
    }
}
