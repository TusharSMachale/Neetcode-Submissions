class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int max = 0;
        int curr = 0;
        int r = heights.length-1;
        while(r > l){
            curr = Math.min(heights[l],heights[r]) * (r-l);
            max = Math.max(curr,max);
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
