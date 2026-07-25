class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for (long i = 1; i <= n; i *= 10) {
            long high = n / (i * 10);
            long cur = (n / i) % 10;
            long low = n % i;
            if (cur == 0) {
                count += high * i;
            } 
            else if (cur == 1) {
                count += high * i + low + 1;
            } 
            else {
                count += (high + 1) * i;
            }
        }
        return count;
    }
}