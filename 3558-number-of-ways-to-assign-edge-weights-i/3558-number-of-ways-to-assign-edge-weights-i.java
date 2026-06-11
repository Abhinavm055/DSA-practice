class Solution {
    ArrayList<ArrayList<Integer>> tree=new ArrayList<>();
    int maxDepth=0;
    public int assignEdgeWeights(int[][] edges) {
       int n=edges.length+1;
       
       for(int i=0;i<n+1;i++){
        tree.add(new ArrayList<>());
       }
       for(int[] e:edges){
        int u=e[0];
        int v=e[1];
        tree.get(u).add(v);
        tree.get(v).add(u);

       }
       dfs(1,-1,0);
       int mod=1_000_000_007;
       int ans=1;
       for(int i=0;i<maxDepth-1;i++){
        ans=(ans*2)%mod;
       }
       return ans;

    }
       
        void dfs(int node, int parent,int depth){
        maxDepth=Math.max(maxDepth,depth);
        for(int nei:tree.get(node)){
            if(nei!=parent){
                dfs(nei,node,depth+1);
            }
        }
    }
}