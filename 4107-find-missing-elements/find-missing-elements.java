class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int a : nums) {
            set.add(a);
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}