class Solution {
    public String processStr(String s) {
       StringBuilder res= new StringBuilder ();
       for(char ch:s.toCharArray()){
        if(ch>=97 && ch<=122){
            res.append(ch);
        }
        else if(ch=='#'){
            res.append(res);
        }
        else if(ch=='*'){
            if (res.length() > 0) {
        res.deleteCharAt(res.length() - 1);
    }
        }
        else{
            res.reverse();
        }
       }
       return res.toString();
    }
}