/*

Longest Valid Parentheses

!LOGIC!

Taken from coding decoded video 

put in stack the areas where longest chain breaks

) when top of stack is not (

also push and pop ( with )

leaves 2 edge cases, what if there is a long chain after the imbalance till the end

Soln: Take 1 variable init to length
keep every pop to that, diff b/w pop and that variable will give length

long chain from start to 1st imalance 
last value to be popped from stack will be the length of this chain, compare it with above max value

return max answer



*/

class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Integer> st = new Stack<Integer>();
        int ans = 0;   int t = s.length();
        
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i)=='('){
                st.push(i);
            }
            
            else{
                
                if(!st.isEmpty() && s.charAt(st.peek())=='('){
                    st.pop();
                }
                else{
                    st.push(i);
                }
                
            }
  
        }
        
        while(!st.isEmpty()){
            
            ans = Math.max(ans,(t-st.peek()-1));
            t = st.peek();
            st.pop();

        }
        
        ans = Math.max(ans,t);
        
       return ans; 
    }
}
