class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int pos=0;
        int blank=0;
        for(char a:moves.toCharArray()){
            if(a=='L') pos--;
            else if(a=='R') pos++;
            else blank++;
        }
        return Math.abs(pos)+blank;
    }
}