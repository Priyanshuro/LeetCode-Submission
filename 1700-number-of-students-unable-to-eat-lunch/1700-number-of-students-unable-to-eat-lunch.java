class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
        int m=sandwiches.length;
        int no_of_ones=0;
        int no_of_zeros=0;
        for(int i=0;i<n;i++){
            if(students[i]==0){
                no_of_zeros++;
            }
            else{
                no_of_ones++;
            }
        }
        for(int i=0;i<m;i++){
            if(sandwiches[i]==0){
                if(no_of_zeros>0){
                    no_of_zeros--;
                }else{
                    break;
                }
            }
            else{
                if(no_of_ones>0){
                    no_of_ones--;
                }
                else{
                    break;
                }
            }
        }
        int sum=no_of_ones+no_of_zeros;
        return sum;
    }
}