class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<numRows || numRows==1){
            return s;
        }
        StringBuilder res = new StringBuilder();
        StringBuilder[] r = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            r[i] = new StringBuilder();
        }
        int cR=0;
        boolean dir =false;
        for(char c:s.toCharArray()){
            r[cR].append(c);
            if(cR==0||cR==numRows-1){
                dir = !dir;
            }
            cR+=dir?1:-1;
        }
        for(StringBuilder i:r){
            res.append(i);
        }
        return res.toString();
    }
}