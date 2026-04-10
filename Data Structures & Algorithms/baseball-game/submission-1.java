class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s : operations){
            if(s.equals("+")){
                int a = st.pop();
                int b = a + st.peek();
                st.push(a);
                st.push(b);
            }else if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                st.push(st.peek() * 2);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for(int l : st){
            sum += l;
        }
        return sum;
    }
}