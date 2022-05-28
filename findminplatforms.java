class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    //benjaminhernmr.21.1.99.0@gmail.com
    //QaZwSx
    static int findPlatform(int arr[], int dep[], int n)
    {
        int curr = 0;
        int max = 0;
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i = 0 ; int j = 0;
        
        while(i < n && j < n){
            
            if(arr[i] <= dep[j]){
                
                curr++;
                max = Math.max(curr,max);
                i++;
                
            }
            else{
                
                curr--;
                max = Math.max(curr,max);
                j++;
                
            }
      
        }
        while(i<n){
                 curr++;
                max = Math.max(curr,max);
                i++;
                
            }
        while(j<n){     
                curr--;
                max = Math.max(curr,max);
                j++;
        }
        
      return max;  
    }
    
}
