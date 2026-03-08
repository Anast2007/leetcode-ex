class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str="";
        for(String w:words){
            str = str+w;
            if(str.equals(s)) return true;
        }
        return false;
    }
}