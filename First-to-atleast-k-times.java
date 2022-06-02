/*

First element to atleast k times

Keep a hashmap, insert 1st time ( key doesnt exist ) as :

arr[i] -> 1;

if key already exists, increment the value

since k maybe 1 the check for k should be outside if-else block

*/
class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        
        int x=0;
        
        for(int i: a){
            
            if(!m.containsKey(i)){
                
                m.put(i,1);
                
            }
            else{
                
                x = m.get(i);
               
               
                x++;
                
                
                m.put(i,x);
                
            }
          
          x = m.get(i);    
            
          if(x == k){
                    
                    return i;
                    
            }  
            
        }
        
     return -1;   
    } 
}
