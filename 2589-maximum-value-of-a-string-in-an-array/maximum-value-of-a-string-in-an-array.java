class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String s : strs) {
            boolean number = true;
            for (char c : s.toCharArray()) {
                if (c < '0' || c > '9') {
                    number = false;
                    break;
                }
            }
            int value;
            if (number) value = Integer.parseInt(s);
            else value = s.length();
            
            if (value > max) max = value;
        }
        return max;
    }
}