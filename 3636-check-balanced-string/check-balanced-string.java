class Solution {
    public boolean isBalanced(String num) {
        int e=0;
        int o=0;
        for(int a=0; a<num.length(); a++){
            if(a%2 == 0) e +=num.charAt(a)-'0';
            else o +=num.charAt(a)-'0';
        }
        return e==o;
    }
}