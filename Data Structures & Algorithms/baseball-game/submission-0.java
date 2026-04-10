class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String str : operations){
            if(str.equals("C")){
                stack.pop();
            }else if(str.equals("D")){
                stack.push(stack.peek()*2);
            }else if(str.equals("+")){
                int a = stack.pop();
                int sum = a + stack.peek();
                stack.push(a);
                stack.push(sum);
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        int result = 0;
        for(int s : stack){
            result += s;
        }
        return result;
    }
}