class Solution {
    public boolean searchMatrix(int[][] a, int k) {
        int row = 0;
        int col = a[0].length-1;
        while (row<a.length && col>=0){
            if(a[row][col]==k){
                return true;
            }
            else if(a[row][col]>k){
                col--;
            }
            else{
                row++;
            }
         }   
        return false;
    }
}