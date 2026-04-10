class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int j=0; j<s.length(); j++){
            char c = s.charAt(j);
            if(map.get(c) == 1){
                return j;
            }
        
        }
        return -1;

    }
}