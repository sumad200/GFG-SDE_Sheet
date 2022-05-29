class Solution
{
    int maxLen(int arr[], int n)
    {
             
             Map<Integer,Integer> sums =  new HashMap <Integer,Integer>();
             
             int psum = 0;
             
             int maxlen = 0; int len = 0;
             
             for(int i=0 ; i < n ; i++){
                      
                 psum += arr[i];
                 
                if(psum == 0){
                    
                    len = i+1;
                    maxlen = Math.max(maxlen,len);
                    
                }
                 
                 
                if(!sums.containsKey(psum)){
                 
                 sums.put(psum,i);
                 
                }
                
                else{
                    
                    len = i - sums.get(psum);
                    maxlen = Math.max(maxlen,len);
                    
          
                }
                
                
             }
             
        return maxlen;     
    }
}
