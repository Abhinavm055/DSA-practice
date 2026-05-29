class Solution {
    public String minWindow(String s, String t) {
     int minLen=Integer.MAX_VALUE;
     int idx=0;
     int hash[]=new int[128];
     int c=0;
     int left=0,right=0;
     for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        hash[ch]++;
     }
     while(right<s.length()){
        char ch=s.charAt(right);
        if(hash[ch]>0){
            c++;
        }
        hash[ch]--;
        while(c==t.length()){
          if(right-left+1<minLen){
            minLen=right-left+1;
            idx=left;
          }
          char leftChar=s.charAt(left);
          hash[leftChar]++;
          if(hash[leftChar]>0){
            c--;
           }
           left++;
        }
        right++;
     }
     if(minLen==Integer.MAX_VALUE){
        return "";
     }
     return s.substring(idx,idx+minLen);

    }
}