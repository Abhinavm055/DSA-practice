class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int ans=1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        while(set.contains(ans)){
                ans++;
          }
        return ans;
    }
}