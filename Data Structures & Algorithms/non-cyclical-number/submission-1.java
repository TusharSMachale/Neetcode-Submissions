class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while(n != 1){
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
                n = square(n);              
            }
        }  
        return true;        
        
    }
    public static int square(int n){
            int sum = 0;
            int r = 0;
            while(n!=0){
                r = n%10;
                sum += r*r;
                n = n/10;
            }
            return sum;
        }
}
