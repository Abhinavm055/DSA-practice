class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int pre[]=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           pre[i]=pre[i-1]+nums[i];
        }
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            int tar=pre[i]-k;
            if(map.containsKey(tar)){
                count+=map.get(tar);
            }
            map.put(pre[i],map.getOrDefault(pre[i],0)+1);
        }
        return count;
    }
}