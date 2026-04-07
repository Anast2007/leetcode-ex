class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(jewels.contains(stones.valueOf(ch))) count++;
        }
        return count;
    }
}