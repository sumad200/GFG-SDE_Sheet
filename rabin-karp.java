/*

RABIN KARP IN JAVA FOR 
PATTERN SEARCHING PROBLEM

Based on rolling hash 

points to be noted:
(i) Large power values prevented by taking mod power before hand
(ii) Hash calculated one step by step ans mod taken to prevent overflow

/*

class Solution{
    
    ArrayList<Integer> search(String pat, String S){
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = 6971;
        int target = 0; int win1 = 0;
        
        for(int i=0; i<pat.length();i++){
            target *=26%n;
            target += pat.charAt(i)-'a';
            target = target % n;
        }
    target = target % n;
    //System.out.println(target);
    
    int pow = 1;
    
    for(int i=0;i<pat.length()-1;i++){
        pow *= 26;
        pow = pow % n;
    }
   //System.out.println(pow);
    
    for(int i=0; i<pat.length();i++){
            win1 *=26%n;
            win1 += S.charAt(i)-'a';
            win1 = win1 % n;       
    }
    win1 = win1 % n;
   //System.out.println(win1);
    
    if(win1 == target && S.substring(0,pat.length()).equals(pat)){
        ans.add(1);
    }
    
    int l=1;
    
    while(l<=(S.length()-pat.length())){
        
        win1 -= (S.charAt(l-1)-'a')*pow;
        win1 = win1 * 26;
        win1 = win1 % n;
        //System.out.println(win1);
        win1 += S.charAt(l+(pat.length()-1))-'a';
        //win1 = win1 % n;
        
        if(win1 < 0){
            win1 = win1 + n;
        }
        
        if(win1 == target && S.substring(l,l+pat.length()).equals(pat)){
        ans.add(l+1);
        }
        
        l++;
    }
    
    if(ans.size()==0){
        ans.add(-1);
    }
        
        
     return ans;    
    }
}
