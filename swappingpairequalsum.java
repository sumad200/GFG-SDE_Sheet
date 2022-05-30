class Solution
{
    long findSwapValues(long A[], int n, long  B[], int m)
    {
         if(m < n){
            
            findSwapValues(B, m, A, n);
            
        }
        
        Set <Long> s = new TreeSet<Long>();
        
        long s1 = 0; long s2=0;
        
        for (long i: A){
            
            s.add(i);
            s1 += i;
            
        }
        
        for (long j: B){
            
            s2 += j;
            
        }
        
         for (long j: B){
          
          if( (s1 - s2) % 2 != 0 ){
              return -1;
          }
          
          else{
              
              long xx = ((s1-s2)/2)+j;
              
              if(s.contains(xx)){
                  return 1;
              }
              
          }
          
             
         }
        
    return -1;    
    }
}
