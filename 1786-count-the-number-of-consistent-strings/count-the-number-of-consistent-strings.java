class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for(String word : words) {
            boolean found = true;
            for(char c : word.toCharArray()) {
                if(allowed.indexOf(c) == -1) {
                    found = false;
                    break;
                }
            }
            if(found) ans++;
        }
        return ans;
    }
}