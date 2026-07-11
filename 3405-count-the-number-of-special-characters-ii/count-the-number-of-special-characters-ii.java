class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for(char c = 'a'; c <= 'z'; c++){
            int last = word.lastIndexOf(c);
            int first = word.indexOf(Character.toUpperCase(c));
            if(last != -1 && first != -1 && last < first) {
                count++;
            }
        }
        return count;
    }
}