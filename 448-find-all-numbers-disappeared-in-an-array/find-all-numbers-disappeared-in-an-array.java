class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        boolean[] arr=new boolean[n+1];
        for(int num:nums){
            arr[num] = true;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(!arr[i]) res.add(i);
        }
        return res;
    }
}