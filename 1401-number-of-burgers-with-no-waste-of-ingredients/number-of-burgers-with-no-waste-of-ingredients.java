class Solution {
    public List<Integer> numOfBurgers(int tomato, int cheese) {
        int jumbo = (tomato - 2 * cheese) / 2;
        int small = cheese - jumbo;
        if (jumbo < 0 || small < 0 || 4 * jumbo + 2 * small != tomato)
            return new ArrayList<>();
        return Arrays.asList(jumbo, small);
    }
}