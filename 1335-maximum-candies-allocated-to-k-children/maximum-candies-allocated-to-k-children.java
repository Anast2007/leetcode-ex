class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 1;
        int right = 0;
        for(int candy : candies){
            right = Math.max(right, candy);
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            long sum = 0;
            for(int candy : candies){
                sum += candy / mid;
            }
            if(sum >= k) left = mid + 1;
            else right = mid - 1;
        }
        return right;
    }
}