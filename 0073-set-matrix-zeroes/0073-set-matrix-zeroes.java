class Solution {
    public void setZeroes(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        Set<Integer> Zerorows = new HashSet<>();
        Set<Integer> Zerocols = new HashSet<>();
        for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
              if(a[i][j]==0){
                Zerorows.add(i);
                Zerocols.add(j);
              }
            }
         }
         for(int r:Zerorows){
            for(int j=0;j<n;j++){
                a[r][j]=0;
            }
         }
         for(int c:Zerocols){
            for(int j=0;j<m;j++){
                a[j][c]=0;
            }
         }

    }
}