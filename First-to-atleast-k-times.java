/*

First element to atleast k times

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
