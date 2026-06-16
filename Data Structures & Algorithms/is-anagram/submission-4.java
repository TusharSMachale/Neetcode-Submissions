class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char d : t.toCharArray()){
            if(map.containsKey(d)){
                map.put(d, map.get(d)-1);
            }else{
                return false;
            }
            if(map.get(d) == 0){
                map.remove(d);
            }
        }
        return map.isEmpty();
    }
}
