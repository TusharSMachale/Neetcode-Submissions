class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int s : sticks){
            min.offer(s);
        }
        int count = 0;
        while(min.size() > 1){
            int a = min.poll();
            int b = min.poll();
            int c = a+b;
            count += c;
            min.offer(c);
        }
        return count;
    }
}
