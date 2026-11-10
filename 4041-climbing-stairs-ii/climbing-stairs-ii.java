class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] ans = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            ans[i] = ans[i - 1] + costs[i - 1] + 1;
            if(i >= 2) {
                ans[i] = Math.min(ans[i], ans[i - 2] + costs[i - 1] + 4);
            }
            if(i >= 3) {
                ans[i] = Math.min(ans[i], ans[i - 3] + costs[i - 1] + 9);
            }
        }
        return ans[n];
    }
}