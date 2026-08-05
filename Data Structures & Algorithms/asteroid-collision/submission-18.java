class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int n : asteroids){
            if(n >= 0){
                st.push(n);
            }else{ 
                 if(st.isEmpty() || st.peek() < 0){
                    st.push(n);
                }
                while(!st.isEmpty() && st.peek() > 0){
                    if(st.peek() == -n){
                        st.pop();
                        break;
                    }
                    else if(st.peek() < -n){
                        st.pop();
                    }else{
                        break;
                    }

                    if(st.isEmpty() || st.peek() < 0){
                        st.push(n);
                    }
                }
                
            }
        }

        int[] ans = new int[st.size()];
        int b = 0;
        for(int a : st){
            ans[b] = a;
            b++;
        }

        return ans;
    
    }
}