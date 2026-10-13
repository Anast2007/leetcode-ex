class Solution {
    public String customSortString(String order, String s) {
        StringBuilder ans =  new StringBuilder();
        for(char c : order.toCharArray()) {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c) ans.append(c);
            }
        }
        for(int i = 0; i < s.length(); i++) {
            if(order.indexOf(s.charAt(i))  == -1) ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}