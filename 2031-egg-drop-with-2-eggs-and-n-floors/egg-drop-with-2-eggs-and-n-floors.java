class Solution {
    public int twoEggDrop(int n) {
        int floor = 0, drop = 0;
        while(floor < n) {
            drop++;
            floor += drop;
        }
        return drop;
    }
}