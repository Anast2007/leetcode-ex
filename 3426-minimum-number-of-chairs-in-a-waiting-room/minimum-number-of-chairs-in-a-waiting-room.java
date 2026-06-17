class Solution {
    public int minimumChairs(String s) {
        int cur=0;
        int max=0;
        for(char c:s.toCharArray()){
            if(c == 'E') cur++;
            else cur--;
            max = Math.max(cur,max);
        }
        return max;
    }
}