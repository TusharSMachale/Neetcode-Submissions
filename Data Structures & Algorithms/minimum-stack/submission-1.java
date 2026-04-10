class MinStack {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<> ();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val <= minStack.peek()){
            mainStack.push(val);
            minStack.push(val);
        }else{
            mainStack.push(val);
        }
    }
    
    public void pop() {
        int remove = mainStack.pop();
        if(remove == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return mainStack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
