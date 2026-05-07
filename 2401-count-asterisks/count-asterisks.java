class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean res=false;
        for(char c:s.toCharArray()){
            if(c=='|') res=!res;
            else if(c=='*' && !res) count++;
        }
        return count;
    }
}