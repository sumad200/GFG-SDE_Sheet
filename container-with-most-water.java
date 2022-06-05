/*

Container with most water 

!LOGIC!
Two Pointer approach

*/

class Solution {
    public int maxArea(int[] h) {
        
        
        int l=0; int r = h.length-1; int area=0;
        
        while(l<r){
            
           int ht = Math.min(h[l],h[r]);
            area = Math.max(area,ht*(r-l));
            
            if(h[l]<h[r]){
                int p1 = h[l];
                while(h[l]<=p1 && l<r){  // Enhancement to skip area calculation for those heights whose values are smalle
                    l++;                 // Previous Height
                }
            }
            else{
                int p2 = h[r];
                while(h[r]<=p2 && l<r){
                    r--;
                }
            }
            
            
        }
        
     return area;  
    }
}
