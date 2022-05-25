import java.util.*;
public class reverseingroups
{ 
    static void swap( int[] nums, int a, int b ){
        
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        
    }
	
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int[] arr = {1, 9, 3, 4, 5, 6, 7, 8};
		
		int k = 3;
		int m = 0;
		
		while(m <= arr.length-k){
		    
		    for(int i=0; i<k/2;i++){
		        
		        int zz = m+i;
		        int yy = ((m+k)-i-1);
		        System.out.println(" m =  "+zz);
		        System.out.println(" k =  "+yy);
		       
		        swap(arr,zz,yy);
		        
		    }
		    
		    
		    m = m+k;
		}
		
	if(m != arr.length){
	    
	    k = arr.length - m;
	    
	     for(int i=0; i<k/2;i++){
		        
		        int zz = m+i;
		        int yy = ((m+k)-i-1);
		        System.out.println(" m =  "+zz);
		        System.out.println(" k =  "+yy);
		       
		        swap(arr,zz,yy);
		        
		    }

	}
	System.out.println(Arrays.toString(arr));
		
	}
}
