class Solution {
    String printLargest(String[] arr) {
        
        Arrays.sort(arr, new Comparator<String> (){
            
            @Override
            public int compare(String a, String b){
                
                String s1 = a.concat(b);
                String s2 = b.concat(a);
                
                if(Double.parseDouble(s1) > Double.parseDouble(s2)) return -1;
                else return 1;
                
            }

        } );
        
         String ans = "";
         for( String g: arr){
             ans = ans.concat(g);
         }
      return ans;   
    }
}
