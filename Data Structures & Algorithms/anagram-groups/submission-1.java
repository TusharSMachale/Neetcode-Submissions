class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> freq = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            if(freq.containsKey(temp)){
                freq.get(temp).add(s);
            }else{
                List<String> l = new ArrayList<>();
                l.add(s);
                freq.put(temp, l);
            }
        }

        return new ArrayList<>(freq.values());
    }
}
