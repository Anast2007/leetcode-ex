class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] a=jewels.toCharArray();
        char[] b=stones.toCharArray();
        int c=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(a[i] == b[j]) c++;
            }
        }
        return c;
    }
}