/*

Set Matrix zeros for its entire row and column if any one element in a row 
or column is 0

!LOGIC!

NeetCode video


*/

class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean row1 = false;
        boolean col1 = false;
        
        int r = matrix.length;
        int c = matrix[0].length;
        
        for(int j=0; j<c; j++)
        if(matrix[0][j] == 0)row1 = true;
        
        for(int i=0; i<r; i++)
        if(matrix[i][0] == 0)col1 = true;
        
        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
          }} }
      
         for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0 ){
                    matrix[i][j] = 0;
          }}}
      
        if(row1){
            for(int j=0; j<c; j++) matrix[0][j]=0;
        }
        if(col1){
            for(int i=0; i<r; i++) matrix[i][0]=0;
        }
        }
            
    }
