class Solution {
    
    void swap( int[] nums, int a, int b ){
        
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        
    }
    
    
    void zigZag(int arr[], int n) {
        for (int i = 1; i < arr.length-1; i++){
		    
		    if(i%2 != 0){
		        
		        if(arr[i] < arr[i-1]){
		            swap(arr,i,i-1);
		        }
		        if(arr[i] < arr[i+1]){
		            swap(arr,i,i+1);
		        }
		        
		    }
		    
		    if(i%2 == 0){
		        
		        if(arr[i] > arr[i-1]){
		            swap(arr,i,i-1);
		        }
		        if(arr[i] > arr[i+1]){
		            swap(arr,i,i+1);
		        }
		        
		    }
		    
		}
    }

}
