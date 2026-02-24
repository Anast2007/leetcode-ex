class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0,right=0;
        while(right*right <= c) right++;
        right--;
        while(left<=right){
            long sum=left*left + right*right;
            if(sum==c) return true;
            else if(sum<c) left++;
            else right--;
        }
        return false;
    }
}