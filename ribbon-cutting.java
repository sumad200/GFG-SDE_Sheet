/*

Ribbon Cutting , find max size to which pieces can be cut such that minimum of k pieces is maintained;

!LOGIC!

Brute - try all possible sizes possible ( maximum size to 1 ) decrementing till pieces is >=k

Optimal (This code)

Binary search b/w 1 to max. size

if( pieces less) reduce high to mid-1, piece size too big
else increase low as we may get a bigger piece size that satisfies k

!BRUTE APPROACH CODE IN LINTCODE!

*/
public class Solution {
    /**
     * @param l: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] nums, int k) {
        
        if(nums.length == 0){
            return 0;
        }

         long max = nums[0]; long sum = 0; long min = 1;
         long ans = 0;

        for(int i=0; i<nums.length; i++){
          
          max = Math.max(max,nums[i]);
          sum += nums[i];
        
        }
        if(sum < k){
            return 0;
        }
        
        

        while(min <= max){
           
           int pieces = 0;

           long mid = (max+min)/2;
           
           for(int i = 0; i<nums.length; i++){
                   
              pieces += (nums[i])/mid;

            }
            
            if(pieces >= k){
               
               ans = Math.max(ans,mid);
           
               min = mid+1;

            }
            else{
                 max = mid-1;
            }

        }

    return (int)ans;
    }
}
