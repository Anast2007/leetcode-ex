class Solution {
    public int findMin(int[] nums) {
        PriorityQueue<Integer > queue = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            queue.add(nums[i]);
        }
        return queue.poll();
    }
}