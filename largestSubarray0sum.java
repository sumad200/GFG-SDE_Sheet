/*

Hashmap <prefix-sum,index> to store 1 st instance of prefix sum, if that same prefix sum occurs again stop insertion and find length with index

Keep length and maxlen , store maximum length in maxlen


!IMPORTANT: above idea Doesnt work as it is if entire array sum is 0 , solns: 

handle prefix sum = 0 case separately , length = i;

or put 0 (psum) , -1 (index) before loop


*/


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
