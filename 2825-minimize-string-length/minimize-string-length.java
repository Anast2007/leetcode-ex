class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set=new HashSet<>();
        for(char a:s.toCharArray()) set.add(a);
        return set.size();
    }
}