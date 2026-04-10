class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> min = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
        int i = 0;
        for(int[] n : points){
            int a = n[0];
            int b = n[1];
            int c = (b*b + a*a);
            min.offer(new int[]{c,i});
            i++;
        }
        List<int[]> l = new ArrayList<>();
        for(int j=1; j<=k; j++){
            int[] temp = min.poll();
            l.add(points[temp[1]]);
        }
        int[][] mat = l.toArray(new int[0][]);

        return mat;


    }
}
