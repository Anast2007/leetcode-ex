class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] a = new int[26];
        int[] b = new int[26];
        boolean[] x = new boolean[26];
        boolean[] y = new boolean[26];
        for (char c : word1.toCharArray()) {
            a[c - 'a']++;
            x[c - 'a'] = true;
        }
        for (char c : word2.toCharArray()) {
            b[c - 'a']++;
            y[c - 'a'] = true;
        }
        if (!Arrays.equals(x, y)) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
