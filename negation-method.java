/***

Negation method for arrays if an element is present its index-1 value is negated ex: 6 is present a[5] = -a[5]


*****/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	int [] arr = {6,1,2,9,3,4,7,10,5};
	
	for (int i=0; i < arr.length; i++){
	    
	      int x = Math.abs(arr[i])-1;
	      
	      if(x<arr.length){
	          
	          arr[x] = -1 * Math.abs(arr[x]);
	          
	      }
	}
          
   
	System.out.println(Arrays.toString(arr));

		
	}
}
