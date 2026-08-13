class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        HashSet<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()){
            set.add(c);
        }

        for(String word : words){
            boolean flag = true;
            for(char ch : word.toCharArray()){
                if(!set.contains(ch)){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}