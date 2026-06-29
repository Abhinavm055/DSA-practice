class Solution {
    public String convertToBase7(int num) {
        if(num==0){return "0";}
    int temp=num;
    if(temp<0) temp=temp*-1;
      StringBuilder sb=new StringBuilder();
      while(temp>0){
         sb.append(temp%7);
         temp/=7;
      }  
      if(num<0){
        sb.append("-");
      }
      return sb.reverse().toString();
    }
}