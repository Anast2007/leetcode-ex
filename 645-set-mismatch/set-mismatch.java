class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                ans[0] = nums[i];
            }
        }
        HashSet<Integer > set = new HashSet<>();
        for(int arr : nums){
            set.add(arr);
        }
        for(int j = 1; j <= nums.length; j++){
            if(!set.contains(j)){
                ans[1] = j;
                break;
            }
        }
        return ans;
    }
}