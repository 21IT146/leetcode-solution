class Solution {
    public int minPartitions(String n) {
        int ans=0;
        for(int i=0;i<n.length();i++){
            int p=(int) n.charAt(i);
            int number=p-48;
            ans=Math.max(ans,number);
        }
        return ans;
    }
}
