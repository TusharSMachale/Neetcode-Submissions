class Solution {
    public String largestNumber(int[] nums) {
        String[] ans = Arrays.stream(nums).mapToObj(String::valueOf).sorted((a,b) -> (b+a).compareTo(a+b)).toArray(String[]::new);
        
        if(ans[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder(nums.length);
        for(String str : ans){
                sb.append(str);
            }
        return sb.toString();
    }
}