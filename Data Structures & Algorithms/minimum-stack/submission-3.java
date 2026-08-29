class MinStack {
    Stack<int[] >st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new int[]{val, val});
        }else{
            int min = Math.min(st.peek()[1], val);
            st.push(new int[]{val, min});
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
        }
    }
    
    public int top() {
        if(!st.isEmpty()){
            return st.peek()[0];
        }else{
            return -1;
        }
        
    }
    
    public int getMin() {
        if(!st.isEmpty()){
            return st.peek()[1];
        }else{
            return -1;
        }
    }
}
