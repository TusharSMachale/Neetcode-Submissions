class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank = new int[26];
        for(int i=0; i<order.length(); i++){
            rank[order.charAt(i) - 'a'] = i;
        }

        for(int j=0; j<words.length-1; j++){
            String w1 = words[j];
            String w2 = words[j+1];
            boolean diff = false;
            for(int k=0; k < Math.min(w1.length(), w2.length()); k++){
                char c1 = w1.charAt(k);
                char c2 = w2.charAt(k);

                if(rank[c1 - 'a'] < rank[c2 - 'a']){
                    diff = true;
                    break;
                }else if(rank[c1 - 'a'] > rank[c2 - 'a']){
                    return false;
                }
            }
            if(!diff && w1.length() > w2.length()){
                return false;
            }
        }
        return true;
    }
}