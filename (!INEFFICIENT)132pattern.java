class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums==null||nums.length<3) return false;
        TreeSet<Integer> s =  new TreeSet<Integer>();
        
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            min[i] = Math.min(min[i-1],nums[i]);
        }
        
        for(int i=nums.length-1;i>0;i--){
            int x = min[i-1];
            if(s.lower(nums[i])!=null){
                int yf = s.lower(nums[i]);
            if(nums[i]>yf && nums[i]>x && yf>x){
                return true;
            }
            }
            s.add(nums[i]);
        }

     return false;   
    }
}
