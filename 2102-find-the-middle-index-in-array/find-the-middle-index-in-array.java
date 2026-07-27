class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        int left = 0;
        for(int i = 0; i < nums.length; i++) {
            if(left == sum - left - nums[i]) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}