class Solution {
    public int numOfSubarrays(int[] arr) {
        long res = 0;
        int odd = 0, even = 1, sum = 0;
        for(int a : arr) {
            sum = sum + a;
            if(sum % 2 == 0) {
                res += odd;
                even++;
            }
            else {
                res += even;
                odd++;
            }
        }
        return (int) (res % 1000000007);
    }
}