class Solution {
    public int countElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        int ans = 0;
        for(int b : arr){
            if(map.containsKey(b+1)){
                ans++;
            }
        }
        return ans;
    }
}
