/*

Valid Parentheses

Classic stack based problem


*/
class Solution {
    public boolean isValid(String s) {
        
         Stack<Character> st = new Stack<Character>();
        
        for(char c: s.toCharArray()){
            
          if(c=='(' || c=='{' || c=='['){
                st.push(c);
                continue;
            }
            
          if(c == ')'){
           if(!st.isEmpty() && st.peek()=='('){
               st.pop();
               continue;
           }
            else{
                return false;
            }
          }
            
          if(c == ']'){
           if(!st.isEmpty() && st.peek()=='['){
               st.pop();
               continue;
           }
            else{
                return false;
            }
          }
            
          if(c == '}'){
           if(!st.isEmpty() && st.peek()=='{'){
               st.pop();
               continue;
           }
            else{
                return false;
            }
          }
   
        }
        return st.isEmpty();
    }
}
