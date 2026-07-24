class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String a = String.format("%04d", num1);
        String b = String.format("%04d", num2);
        String c = String.format("%04d", num3);
        String ans = "";
        for (int i = 0; i < 4; i++) {
            int min = Math.min(
                a.charAt(i) - '0',
                Math.min(b.charAt(i) - '0', c.charAt(i) - '0')
            );
            ans += min;
        }
        return Integer.parseInt(ans);
    }
}