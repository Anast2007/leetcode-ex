class Solution {
    public int arrangeCoins(int n) {
        int k=0;
        while(n>=k+1){
            k++;
            n=n-k;
        }
        return k;
    }
}