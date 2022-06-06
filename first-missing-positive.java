/*

FIRST MISSING POSITIVE

!LOGIC!
Mix of pepcoding and neetcode videos

Check if 1 is present and mark its presence with a bool

Since negatives are not useful mark them 1

Since for array of size n the possible solution set is b/w 1 and n (inclusive)
so mark all greater than n as also 1

now all positives use negation method
check if 1 missing from bool
rest from array using negation

if both dont return 1-n is present so return n+1

*/
class Solution {
    public int firstMissingPositive(int[] nums) {
        
        boolean o = false;
        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i] == 1){
                o = true;
            }
            
            if(nums[i] > nums.length || nums[i] <= 0){
                
                nums[i] = 1;
                
            }
            
        }
        if(!o){
            return 1;
        }
        
        for(int i=0; i<nums.length; i++){
        
             nums[Math.abs(nums[i])-1] = -1 * Math.abs(nums[Math.abs(nums[i])-1]);

        }
        
        
        if(nums.length > 1){
        for(int i=1; i<nums.length; i++){
           
            if(nums[i]>0) return i+1;
            
        }
        }
     return nums.length+1;   
    }
}
