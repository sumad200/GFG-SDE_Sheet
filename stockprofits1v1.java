import java.util.ArrayList;
import java.util.List;

public class gg {
    public static void main(String[] args) {
        
           int [] a = {3,5,1,7};
        
      
           int x = a[0];

        int profit = 0;

        for (int i = 0; i < a.length; i++) {
            
             x = Math.min(x,a[i]);

             profit = Math.max(a[i]-x,profit);

        }
        
        System.out.println(profit);
 /*
        List<List<Integer>> sub = new ArrayList<List<Integer>>();

        for (int i = 0; i < a.length; i++) {
            
            List<Integer> temp = new ArrayList <Integer> ();

            temp.add(a[i]);

            sub.add(temp);

            List<Integer> temp2 = new ArrayList <Integer> (temp);

            for (int j = i+1; j < a.length; j++) {

        
                temp2.add(a[j]);

                sub.add(temp2);

                temp2 = new ArrayList<Integer>(temp2);

            }

        }

     System.out.println(sub);
*/
    }
}
