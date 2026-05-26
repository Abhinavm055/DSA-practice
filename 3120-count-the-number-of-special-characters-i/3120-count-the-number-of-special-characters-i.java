class Solution {
    public int numberOfSpecialChars(String s) {
     int c=0;
     HashSet<Character> set = new HashSet<>();
     for(char ch : s.toCharArray()){
            set.add(ch);
        }
    for(char ch : set){
        if(Character.isLowerCase(ch) && set.contains((char)(ch-32))){
c++;
        }
    }
    return c;
    }
}