class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();

        int[] lowerCaseIndMap = new int[26];
        int[] upperCaseIndMap = new int[26];

        for(int i = 0; i < n; i++){
            int chInt = (int)word.charAt(i);
            int ind = (chInt >= 97 && chInt <= 123) ? chInt-97 : chInt-65;

            if(chInt >= 97 && chInt <= 123){
                lowerCaseIndMap[ind] = i+1;
            }else if(upperCaseIndMap[ind]-1 == -1){
                upperCaseIndMap[ind]= i+1;
            }
        }

        int ans = 0;

        for(int i = 0; i < 26; i++){
            if(lowerCaseIndMap[i]-1 == -1 || upperCaseIndMap[i]-1 == -1) continue;

            int lastLowerOccur = lowerCaseIndMap[i]-1;
            int firstUpperOccur = upperCaseIndMap[i]-1;

            if(lastLowerOccur < firstUpperOccur) ans++;
        }
        return ans;
    }
}