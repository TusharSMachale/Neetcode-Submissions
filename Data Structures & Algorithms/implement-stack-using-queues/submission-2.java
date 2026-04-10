class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
       queue1.add(x);
    }
    
    public int pop() {
        int size = queue1.size();
      for(int i=1; i<size; i++){
        queue2.add(queue1.remove());
      }
      int popelement = queue1.remove();
      Queue<Integer> q = queue1;
      queue1 = queue2;
      queue2 = q;
      return popelement;
    }
    
    public int top() {
        int size1 = queue1.size();
        for(int i=1; i<size1; i++){
        queue2.add(queue1.remove());
      }
      int peekelement = queue1.remove();
      queue2.add(peekelement);
      Queue<Integer> t = queue1;
      queue1 = queue2;
      queue2 = t;
      return peekelement;
    }
    
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */