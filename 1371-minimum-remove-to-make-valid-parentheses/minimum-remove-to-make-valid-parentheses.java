class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans = new StringBuilder();
        int open = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                open++;
                ans.append(c);
            }
            else if(c == ')') {
                if(open > 0) {
                    open--;
                    ans.append(c);
                }
            }
            else {
                ans.append(c);
            }
        }
        for(int i = ans.length() - 1; i >= 0 && open > 0; i--) {
            if(ans.charAt(i) == '(') {
                ans.deleteCharAt(i);
                open--;
            }
        }
        return ans.toString();
    }
}