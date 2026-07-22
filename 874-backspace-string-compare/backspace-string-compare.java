class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }
        public String check(String str){
            Stack<Character > stack = new Stack<>();
            for(char ch : str.toCharArray()){
                if(ch == '#'){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }
                else{
                    stack.push(ch);
                }
            }
            String ans = "";
            while(!stack.isEmpty()){
                ans += stack.pop();
            }
            return ans;
        }
       // return ans;
}