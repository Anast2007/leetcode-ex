class Solution {
    public String[] findRelativeRanks(int[] sore) {
        String[] res=new String[sore.length];
        for(int i=0;i<sore.length;i++){
            int rank=1;
            for(int j=0;j<sore.length;j++){
                if(sore[j]>sore[i]) rank++;
                if(rank == 1) res[i]="Gold Medal";
                else if(rank == 2) res[i] ="Silver Medal";
                else if(rank == 3) res[i]="Bronze Medal";
                else res[i]=rank+"";
            }
        }
        return res;
    }
}