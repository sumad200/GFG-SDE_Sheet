/*

!LOGIC

for each possible pair in array when to make both smaller one or both larger one

references: https://www.youtube.com/watch?v=RegQckCegDk
            https://www.youtube.com/watch?v=Dxv_kCAYOk4


*/
class Solution {
    public boolean checkPossibility(int[] nums) {
        
        boolean change = false;
        
        for(int i=0; i<nums.length-1; i++){
            
            if(nums[i]<=nums[i+1]){
                continue;
            }
            
            if(i==0 || nums[i+1] >= nums[i-1]){
                if(change){
                    return false;
                }
                else{
                    nums[i] = nums[i+1];
                    change = true;
                }
            }
            
   else if(nums[i+1] < nums[i-1]){
                if(change){
                    return false;
                }
                else{
                    nums[i+1] = nums[i];
                    change = true;
                }
            }
        }
        
       return true;
    }
}
