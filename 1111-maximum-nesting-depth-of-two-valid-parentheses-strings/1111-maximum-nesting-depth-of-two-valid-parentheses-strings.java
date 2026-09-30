class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int c=0;
        int[] arr=new int[n];
        Stack<Character> sta=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                if(sta.isEmpty()){
                    sta.push(ch);
                    arr[i]=c;
                }
                else{
                    sta.push(ch);
                    c++;
                    arr[i]=c;
                }
            }
            else{
                arr[i]=c;
                c--;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]%2;
        }
        return arr;
    }
}