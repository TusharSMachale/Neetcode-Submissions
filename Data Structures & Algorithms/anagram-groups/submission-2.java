class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        Map<String,List<String>> frequency = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            if(frequency.containsKey(temp)){
                frequency.get(temp).add(s);
            }else{
                List<String> l = new ArrayList<>();
                l.add(s);
                frequency.put(temp,l);
            }
        }

        return new ArrayList<>(frequency.values());
        
    }
}
