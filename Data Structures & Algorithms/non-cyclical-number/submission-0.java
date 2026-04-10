class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        ans = square(n);
        if(ans == 1){
            return true;
        }
        while(ans != 1){
            if(set.contains(ans)){
                return false;
            }else{
                set.add(ans);
                ans = square(ans);              
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
