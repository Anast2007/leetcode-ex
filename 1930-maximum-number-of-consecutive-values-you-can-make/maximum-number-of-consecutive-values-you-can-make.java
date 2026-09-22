class Solution {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int ans = 0;
        for(int a : coins) {
            if(a > ans + 1) {
                break;
            }
            ans += a;
        }
        return ans + 1;
    }
}