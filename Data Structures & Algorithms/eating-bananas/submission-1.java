class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt();
        while(min < max){
            int speed = min + (max-min)/2;
            long hours = getHours(piles,speed);
            if(hours <= h){
                max = speed;
            }else{
                min = speed + 1;
            }
        }
        return min;
    }
    public long getHours(int[] pile, int sp){
        long hours = 0;
        for(int p : pile){
            hours += (long)Math.ceil((double)p/sp);
        }
        return hours;
    }
}
