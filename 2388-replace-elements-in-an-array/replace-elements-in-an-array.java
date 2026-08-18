class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int[] op : operations){
            int old = op[0];
            int newValue = op[1];
            int index = map.get(old);
            nums[index] = newValue;
            map.remove(old);
            map.put(newValue, index);

        }
        return nums;
    }
}