class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        List<Integer> list=new ArrayList<>();
        int r[]=new int[n];
        int c[]=new int[m];
        for(int i=0;i<n;i++){
            r[i]=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                r[i]=Math.min(r[i],arr[i][j]);
            }
        }
        for(int j=0;j<m;j++){
          c[j] = Integer.MIN_VALUE;
          for(int i=0;i<n;i++){
         c[j] = Math.max(c[j], arr[i][j]);
    }
}
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i]==c[j]){
                    list.add(r[i]);
                }
            }
        }
        return list;
    }
}