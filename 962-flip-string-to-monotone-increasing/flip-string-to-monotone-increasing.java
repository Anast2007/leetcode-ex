class Solution {
    public int minFlipsMonoIncr(String s) {
        int flip = 0, one = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') one++;
            else flip = Math.min(flip + 1, one);
        }
        return flip;
    }
}