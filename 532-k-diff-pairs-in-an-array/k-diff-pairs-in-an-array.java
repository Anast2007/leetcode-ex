class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int val : nums) {
            if(set.contains(val - k)) ans.add(val);
            if(set.contains(val + k)) ans.add(val + k);
            set.add(val);
        }
        return ans.size();
    }
}