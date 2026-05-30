class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ans="";
        for(String a:words){
            ans=ans+a.charAt(0);
        }
        return ans.equals(s);
    }
}