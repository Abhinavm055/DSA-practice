class Solution {
    public int trap(int[] height) {
    int n=height.length;
    int left=0;
    int right=n-1;
    int leftmax=height[0];
    int rightmax=height[n-1];
    int ans=0;
    while(left<right){
        if(leftmax<rightmax){
            left++;
            leftmax=Math.max(leftmax,height[left]);
            ans+=leftmax-height[left];
        }
        else{
            right--;
            rightmax=Math.max(rightmax,height[right]);
            ans+=rightmax-height[right];
        }
    } 
    return ans;  
    }
}