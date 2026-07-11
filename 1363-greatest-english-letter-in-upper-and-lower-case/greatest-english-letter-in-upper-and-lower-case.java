class Solution {
    public String greatestLetter(String s) {
        for(char c = 'Z'; c >= 'A'; c--){
            if(s.contains("" + c) && 
            s.contains("" + Character.toLowerCase(c))){
                return "" + c;
            }
        }
        return "";
    }
}