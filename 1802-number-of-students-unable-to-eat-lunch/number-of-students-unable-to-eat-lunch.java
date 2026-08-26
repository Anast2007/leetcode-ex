class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0, one = 0;
        for(int x : students) {
            if(x == 0) zero++;
            else one++;
        }
        for(int a : sandwiches) {
            if(a == 0){
                if(zero == 0) return one;
                zero--;
            }
            else {
                if(one == 0)  return zero;
                one--;
            }
        }
        return 0;
    }
}