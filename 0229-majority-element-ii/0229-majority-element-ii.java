class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> ls = new ArrayList<>();
       int n=nums.length;
       int ind=0;
       int count=0;
       for(int i=0;i<n;i++){
        count=0;
        for(int j=i;j<n;j++){
          if(nums[i]==nums[j]){
            count++;
            ind=nums[i];
          }  
        }
        if(count>n/3 && !ls.contains(nums[i])){
            ls.add(ind);
        }
       } 
       return ls;
    }
}