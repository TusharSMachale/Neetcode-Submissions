class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed = 1;
        int maxspeed = Arrays.stream(piles).max().getAsInt();

        while(minspeed < maxspeed){
            int speed = minspeed + (maxspeed - minspeed)/2;
            long hour = hourstaken(piles, speed);
            if(hour <= h){
                maxspeed = speed;
            }else{
                minspeed = speed + 1;
            }
        }
        return minspeed;
    }
    public long hourstaken(int[] piles, int sp){
        long hours = 0;
        for(int p : piles){
            hours += (long)Math.ceil((double)p/sp);
        }
        return hours;
    }
}
