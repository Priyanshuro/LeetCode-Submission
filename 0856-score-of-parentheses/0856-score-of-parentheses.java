class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        int output=0;
        int valid=0;
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
            }
            else{
                count--;
                if(s.charAt(i-1)=='('){
                    output=output+(1<<count);
                }
            }
        }
        return output;
    }
}