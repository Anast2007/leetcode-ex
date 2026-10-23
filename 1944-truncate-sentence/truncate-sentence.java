class Solution {
    public String truncateSentence(String s, int k) {
        String[] word = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < k; i++) {
            if(i > 0) {
                res.append(" ");
            }
            res.append(word[i]);
        }
        return res.toString();
    }
}