class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int pos = 0;
        int count = 0;
        for(int n = 0; n < nums.length; n++){
            pos += nums[n];
            if(pos == 0) count++;
        }
        return count;
    }
}