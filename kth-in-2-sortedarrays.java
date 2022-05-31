/*

K th element in 2 sorted arrays

!LOGIC!

k th element will be a collection of i elements from array 1 and k-i elements from array 2

the answer will be max of both bcoz when these k elements will be sorted, the max will occupy the 

kth position, to find max we only need to compare last picked element fron both arrays

as the before ones are already sorted

*/

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
            
            int l1; 
            
            if(p1 > 0){ 
            l1 = arr1[p1-1];
            }
            else{
            l1 = Integer.MIN_VALUE;
            }
            
            
            int l2; 
            
            if(p2 > 0){
            l2 = arr2[p2-1];
            }
            else{
            l2 = Integer.MIN_VALUE;
            }  
            
            int r1;
            if (p1 < n) { 
                r1 = arr1[p1];
            }
            else{
                r1 = Integer.MAX_VALUE;
            }
            int r2; 
            if (p2 < m) {
                r2 = arr2[p2] ;
            }
            else{
               r2 = Integer.MAX_VALUE;  
            } 
            
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
