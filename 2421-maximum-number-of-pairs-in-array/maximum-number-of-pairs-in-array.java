class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] count =new int[101];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int pair=0,left=0;
        for(int i=0;i<count.length;i++){
            pair += count[i]/2;
            left +=count[i]%2;
        }
        return new int[]{pair,left};
    }
}