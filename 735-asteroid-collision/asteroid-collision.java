class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int ast : asteroids){
            boolean flag = true;
            while(!stack.isEmpty() && stack.peek() > 0 && ast < 0){
                if(-ast > stack.peek()){
                    stack.pop();
                }
                else if(-ast < stack.peek()){
                    flag = false;
                    break;
                }
                else{
                    flag = false;
                    stack.pop();
                    break;
                }
            }
            if(flag) stack.push(ast);
        }
        int[] res = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--){
            res[i] = stack.pop();
        }
        return res;
    }
}