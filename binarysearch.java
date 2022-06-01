
class Solution {
    int binarysearch(int arr[], int n, int k) {
        
        int lo = 0;
        int hi = n-1;

        while( lo <= hi){
            
            int mid = (lo+hi)/2;
            
            if(arr[mid] == k){
                return mid;
            }
            
            
            if(arr[mid] > k){
      
                hi = mid - 1;
                
            }
            
            if(arr[mid] < k){
                lo = mid + 1;    
            }
     
        }
        
    return -1;  
    }
}
