import java.util.Arrays;
class Solution {
    public int similarPairs(String[] words) {
        int ans = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                boolean[] a = new boolean[26];
                boolean[] b = new boolean[26];
                for(char c : words[i].toCharArray()) {
                    a[c - 'a'] = true;
                }
                for(char c : words[j].toCharArray()) {
                    b[c - 'a'] = true;
                }
                if(Arrays.equals(a, b)) ans++;
            }
        }
        return ans;
    }
}