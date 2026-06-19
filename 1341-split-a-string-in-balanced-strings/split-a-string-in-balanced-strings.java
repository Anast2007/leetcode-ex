class Solution {
    public int balancedStringSplit(String s) {
        int a=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L') a++;
            else a--;
            if(a == 0) count++;
        }
        return count;
    }
}