class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];

        for(int i=n-1; i>=0; i--){
            if(st.isEmpty()){
                ans[i] = 0;
            }else{
                while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                    st.pop();
                }

                ans[i] = st.isEmpty() ? 0 : st.peek()-i;
            }

            st.push(i);
        }

        return ans;
    }
}
