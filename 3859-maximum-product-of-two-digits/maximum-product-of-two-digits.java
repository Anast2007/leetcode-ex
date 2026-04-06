class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        int[] arr =new int[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.charAt(i)-'0';
        }
        Arrays.sort(arr);
        int len=arr.length;
        return arr[len-1] * arr[len-2];
    }
}