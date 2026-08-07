class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character st : s.toCharArray()){
            if(st == '('){
                stack.push(')');
            }
            else if(st == '['){
                stack.push(']');
            }
            else if(st == '{'){
                stack.push('}');
            }
            else{
                if(stack.isEmpty() || stack.pop() != st){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
