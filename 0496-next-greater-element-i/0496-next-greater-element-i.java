class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:nums2){
            while(!st.empty() && i>st.peek()){
                h.put(st.pop(),i);
            }
            st.push(i);
        }
        while(!st.empty()){
            h.put(st.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=h.get(nums1[i]);
        }
        return nums1;
        }
}
