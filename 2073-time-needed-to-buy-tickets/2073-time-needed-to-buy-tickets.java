class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        int time=0;
        while(true){
            for(int i=0;i<n;i++){
                if(i==k && tickets[i]==1){
                    time++;
                    return time;
                }
                else if(tickets[i]!=0){
                    tickets[i]=tickets[i]-1;
                    time++;
                }
            }
        }
    }
}