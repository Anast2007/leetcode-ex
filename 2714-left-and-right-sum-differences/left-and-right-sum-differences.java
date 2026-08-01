class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int totalSum = 0;
        for(int i = 0; i < n; i++){
            totalSum = totalSum + nums[i];
        }
        int leftSum = 0;
        for(int i = 0; i < n; i++){
            totalSum = totalSum - nums[i];
            ans[i] = Math.abs(leftSum - totalSum);
            leftSum = leftSum + nums[i];
        }
        return ans;
    }
}