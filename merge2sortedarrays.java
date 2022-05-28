import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       
       
       int [] a = {1,3,5,7,9};
       int [] b = {-1,2,4};
       
       List<Integer> l = new ArrayList<Integer>();
       
       int i = 0; int j = 0;
       
       while(i<a.length && j<b.length){
           
           if(a[i] < b[j]){
               
               l.add(a[i]);
               i++;
               
           }
           else{
           
               l.add(b[j]);
               j++;
               
           }
           
       }
              System.out.println(l);
       while(i < a.length){
           System.out.println("extra in a ");
           l.add(a[i]);
           i++;
       }
       while(j < b.length){
           System.out.println("extra in b ");
           l.add(b[j]);
           j++;
       }
       
       System.out.println(l);
       
       
    }
}
