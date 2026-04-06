class Solution {
    public int countSegments(String s) {
        if(s == null || s.length() == 0) return 0;
        String[] word=s.trim().split("\\s+");
        return s.trim().isEmpty() ? 0:word.length; 
    }
}