class Solution {
    public int nthUglyNumber(int n) {
        int[] a = new int[n];
        a[0] = 1;
        int x = 0, y = 0, z = 0;
        for (int i = 1; i < n; i++) {
            int n1 = a[x] * 2;
            int n2 = a[y] * 3;
            int n3 = a[z] * 5;
            a[i] = Math.min(n1, Math.min(n2, n3));
            if (a[i] == n1) x++;
            if (a[i] == n2) y++;
            if (a[i] == n3) z++;
        }
        return a[n - 1];
    }
}