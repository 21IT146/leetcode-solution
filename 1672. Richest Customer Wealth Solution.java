class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int m=accounts[0].length;
        int maxwelth=0;
        for(int i=0;i<n;i++)
        {   
            int sum=0;
            for(int j=0;j<m;j++)
            {
                 sum+=accounts[i][j];
            }
            maxwelth=Math.max(maxwelth,sum);
        }
        return maxwelth;
    }
}
