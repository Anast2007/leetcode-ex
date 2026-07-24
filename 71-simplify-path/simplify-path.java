class Solution {
    public String simplifyPath(String path) {
        Stack<String > stack = new Stack<>();
        String[] part = path.split("/");
        for(String a : part){
            if(a.equals("") || a.equals(".")){
                continue;
            }
            if(a.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(a);
                
            }
        }
        StringBuilder ans = new StringBuilder();
        for(String s : stack){
            ans.append("/").append(s);
        }
        if(ans.length() == 0) return "/";
        return ans.toString();
    }
}