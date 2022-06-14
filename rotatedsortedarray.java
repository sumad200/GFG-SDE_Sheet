/*
33. Search in Rotated Sorted Array

!LOGIC!

for every point in given array either low to mid or mid to high is sorted



*/
class Solution {
    public int search(int[] nums, int target) {
        
        int l = 0; int h = nums.length-1;
        
        while(l<=h){
            
            int mid = l + (h-l)/2;
            
            if(nums[mid] == target) return mid;
            
            if(nums[mid]>=nums[l]){
                if(target>=nums[l] && target<nums[mid])
                    h = mid-1;
                else
                    l = mid+1;
                
            }
            else if(nums[mid]<=nums[nums.length-1]){
                
                if(target>nums[mid] && target<=nums[nums.length-1])
                    l = mid+1;
                else
                    h = mid-1;
            }
            
        }
        
       return -1; 
    }
}
