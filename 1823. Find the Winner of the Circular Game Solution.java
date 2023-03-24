class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            q.offer(i);
        }
        while(q.size()>1){
            for(int i=0;i<k-1;i++){
                q.offer(q.remove());
            }
            q.remove();
        }
        return q.peek()+1;
    }
}
