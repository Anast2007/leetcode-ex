class Solution {
    public int minSwaps(String s) {
        int balance = 0;
        int min = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') balance++;
            else balance--;
            min = Math.min(min, balance);
        }
        return (-min + 1) / 2;
    }
}