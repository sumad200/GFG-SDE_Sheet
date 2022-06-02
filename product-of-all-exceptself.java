/*

Product of Array Except Self 






*/


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long pre = 1; long post = 1;
        
        
        long[] ans = new long[n];
        
        Arrays.fill(ans,1);
        
        for(int i=1; i<n; i++){
            
            ans[i] *= pre * nums[i-1];
            
            pre = pre * nums[i-1];
            
        }
        
        for(int i=n-2; i>=0; i--){
            
             ans[i] *= post * nums[i+1];
              
             post = post * nums[i+1]; 
        }
        
        
    return ans;    
	} 
} 
