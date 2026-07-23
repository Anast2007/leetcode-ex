class Solution {
    public int[] evenOddBit(int n) {
        int even = Integer.bitCount(n & 0x5555);
        int odd = Integer.bitCount(n & 0xAAAA);
        return new int[]{even, odd};
    }
}