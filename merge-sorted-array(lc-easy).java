/*

Merge Sorted Array (Leetcode EASY)

Extra 0s provided in 1st array

!LOGIC!
Neetcode video 

Modified merging method from back to fill in descending order

*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int l = nums1.length-1;
        
        int i = m-1; int j = n-1;
        
        while(l >= 0 && i>=0 && j>=0){
            
            if(nums1[i] > nums2[j]){
                
                nums1[l] = nums1[i];
                l--; i--;
                
            }
            else{
                nums1[l] = nums2[j];
                l--; j--;
            }
 
        }

        
        while(i>=0 && l>=0){
            nums1[l] = nums1[i];
            l--; i--;
        }
        
        while(j>=0 && l>=0){
            nums1[l] = nums2[j];
            l--; j--;
        }
        
        
        
    }
}
