class Solution {
    public int numSub(String s) {
        long ans = 0, count = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') count++;
            else count = 0;
            ans += count;
        }
        return (int)(ans % 1000000007);
    }
}