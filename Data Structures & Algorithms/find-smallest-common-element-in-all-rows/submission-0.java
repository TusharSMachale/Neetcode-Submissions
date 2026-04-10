class Solution {
    public int smallestCommonElement(int[][] mat) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int[] num : mat){
            for(int i=0; i<num.length; i++){
                map.put(num[i] , map.getOrDefault(num[i],0)+1);
            }
        }
        for(int key : map.keySet()){
            int a = map.get(key);
            if(a == mat.length){
                min = Math.min(min, key);
            }
        }

        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}
