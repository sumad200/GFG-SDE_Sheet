

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        if(m < n){
            kthElement(arr2,arr1,m,n,k);
        }
        
        int low = Math.max(0,k-m);
        int hi  = Math.min(k,n);
        
        while(low <= hi){
            
            int p1 = (low+hi) >> 1;
            int p2 = k-p1;
            
            int l1 = (p1 > 0) ? arr1[p1-1] : Integer.MIN_VALUE;
            int l2 = (p2 > 0) ? arr2[p2-1] : Integer.MIN_VALUE;
            int r1 = (p1 < n) ? arr1[p1]   : Integer.MAX_VALUE;
            int r2 = (p2 < m) ? arr2[p2]   : Integer.MAX_VALUE;
            
            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1,l2);
            }
            
            else if( l2 > r1 ){
                low = p1 + 1;
            }
            
            else{
                hi = p1 - 1;
            }
            
            
        }
         
     return -1;   
    }
}
