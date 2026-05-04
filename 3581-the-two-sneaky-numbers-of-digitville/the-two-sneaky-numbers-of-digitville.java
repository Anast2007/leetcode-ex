class Solution {
    public int[] getSneakyNumbers(int[] nums) { 
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) list.add(nums[i]);
        }
        int[] res=new int[list.size()];
        for(int j=0;j<list.size();j++){
            res[j]=list.get(j);
        }
        return res;
    }
}