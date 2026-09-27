class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            int sum=0;
            while(nums[i]>0){
                c=nums[i]%10;
                sum=sum+c;
                nums[i]=nums[i]/10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}