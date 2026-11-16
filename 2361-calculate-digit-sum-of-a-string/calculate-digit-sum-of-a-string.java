class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k) {
            String ans = "";
            for(int i = 0; i < s.length(); i += k) {
                String p = s.substring(i, Math.min(i + k, s.length()));
                int sum = 0;
                for(char c : p.toCharArray()) {
                    sum += c - '0';
                }
                ans += sum;
            }
            s = ans;
        }
        return s;
    }
}