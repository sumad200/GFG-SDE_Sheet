import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		
		int x = a[a.length-1]+1;
		
		int r = a.length-1;
		int l = 0;
		
		for ( int i =0; i < a.length; i++){
		
		    if(i%2 == 0){
		        
		        int m = a[r];
		        if(a[r]>x){
		            m = a[r]/x;
		        }
		        
		        a[i] = (a[i]*x) + (m);
		        System.out.println(m);
		        r--;
		        
		    }
		    
		    else{
		        
		        
                a[i] = (a[i]*x) +(a[l] / x);
                l++;
		        
		        
		    }
	
		}
		
		for(int i=0;i<a.length;i++){
		    a[i] = a[i]%x;
		}
		
	}
}
