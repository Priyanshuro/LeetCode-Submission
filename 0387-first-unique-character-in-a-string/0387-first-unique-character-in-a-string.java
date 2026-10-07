class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int count=-1;
        for(int i=0;i<n;i++){
            boolean unique=true;
            char c=s.charAt(i);
            for(int j=0;j<n;j++){
                char ch=s.charAt(j);
                if(i!=j && c==ch){
                    unique=false;
                    break;
                }
            }
            if(unique){
                return i;
            }
        }
        return count;
    }
}