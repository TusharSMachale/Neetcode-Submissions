class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char a : map.keySet()){
            int b = map.get(a);
            if(b % 2 == 0){
                even = Math.min(even, b);
            }else{
                odd = Math.max(odd, b);
            }
        }
        return (odd - even);
    }
}