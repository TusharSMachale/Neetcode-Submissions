class Solution {
    public int largestRectangleArea(int[] heights) {
         int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int res = 0, tp, curr;
        
        for (int i = 0; i < n; i++) {  
          
            // Process the stack while the current element 
            // is smaller than the element corresponding to 
            // the top of the stack
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
              
                // The popped item is to be considered as the 
                // smallest element of the Histogram
                tp = st.pop();
                
                // For the popped item, previous smaller element
                // is just below it in the stack (or current stack 
                // top) and next smaller element is i
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                
                // Update the result if needed
                res = Math.max(res, heights[tp] * width);
            }
            st.push(i);
        }

        // For the remaining items in the stack, next smaller does
        // not exist. Previous smaller is the item just below in
        // the stack.
        while (!st.isEmpty()) {
            tp = st.pop();
            curr = heights[tp] * (st.isEmpty() ? n : n - st.peek() - 1);
            res = Math.max(res, curr);
        }

        return res;

    }
}
