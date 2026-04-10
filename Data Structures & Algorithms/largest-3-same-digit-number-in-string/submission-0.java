class Solution {
    public String largestGoodInteger(String num) {
        if(num.length() < 3){
            return "";
        }
        String max = "";
        for(int i=0; i<num.length()-2; i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
                String trip = num.substring(i,i+3);
                if(max.equals("") || trip.compareTo(max) > 0){
                    max = trip;
                }
            }
        }
        return max;
    }
}