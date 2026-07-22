class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1;
        int right = 0;
        for(int num : quantities){
            right = Math.max(right, num);
        }
        while(left < right){
            int mid = left + (right - left) / 2;
            int sum = 0;
            for(int num : quantities){
                sum += (num + mid - 1) / mid;
            }
            if(sum <= n) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}