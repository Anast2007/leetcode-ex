class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i <= n; i++){
            int currentHeight = i == n ? 0 : heights[i];
            while(!s.isEmpty() && currentHeight < heights[s.peek()]){
                int top = s.pop();
                int width = s.isEmpty() ? i : i - s.peek() - 1;
                int area = heights[top] * width;
                maxArea = Math.max(maxArea, area);
            }
            s.push(i);
        }
        return maxArea;
    }
}