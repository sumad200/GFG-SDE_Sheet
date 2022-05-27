class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long a[],long b[],int N)
    {
        Map<Long,Integer> m = new HashMap<Long,Integer>();
		
        for (int i = 0; i < a.length; i++) {
			
			if(m.containsKey(a[i])){
              
				int x = m.get(a[i]);
				x++;
				m.put(a[i],x);
                
			}
			else{

                m.put(a[i],1);
                
			}

		}

        for(int i=0; i<b.length; i++){

            if( !m.containsKey(b[i]) ){

                return false;
			}
            
			if(m.get(b[i]) == 0 ){
                  
				return false;
                  
			}
			else{
               
				 int ff = m.get(b[i]);
				 ff--;
				 m.put(b[i],ff);

			}
    

		}

		for(long i:m.keySet()){
            
			if(m.get(i) != 0){
				return false;
			}


		}
		return true;
    }
}
