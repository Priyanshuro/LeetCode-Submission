class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int c=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                c++;
                arr[i]=c%2;
            }
            else{
                arr[i]=c%2;
                c--;
            }
        }
        return arr;
    }
}