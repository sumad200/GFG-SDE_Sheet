/*

Remove Palindromic Subsequences

since only a and b are present any string can be removed in 2 steps
remove all As and remove all Bs 

If entire string is a palindrome remove entire string in 1 step

*/
class Solution {
    public int removePalindromeSub(String s) {
            int i=0;
            int j = s.length()-1;
            while(i<j){
                if(s.charAt(i) != s.charAt(j)){
                    return 2;
                }
                i++;j--;
            }
        
        return 1;
    }
}
