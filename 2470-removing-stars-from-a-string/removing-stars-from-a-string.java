class Solution {
    public String removeStars(String s) {
        StringBuilder a = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c == '*') a.deleteCharAt(a.length() - 1);
            else a.append(c);
        }
        return a.toString();
    }
}