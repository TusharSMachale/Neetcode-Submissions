class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : gifts){
            max.add(n);
        }
        int i = 1;
        while(i <= k){
            int a = max.poll();
            int r = (int)Math.sqrt(a);
            max.add(r);
            i++;
        }
        long ans = 0;
        for(int m : max){
            ans += m;
        }
        return ans;
    }
}