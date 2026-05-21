class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int prev = intervals[0][1];
        int count = 0;
        for(int i=1; i<n; i++){
            if(intervals[i][0] < prev){
                count++;
            }else{
                prev = intervals[i][1];
            }
        }
        return count;
    }
}
