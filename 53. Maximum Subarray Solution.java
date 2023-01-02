class Solution {
    public int maxSubArray(int[] number) {
        int maxsum = Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<number.length;i++)
        {
            if(curr<0)
            {
                curr=0;
            }
            curr=curr+number[i];
            maxsum=Math.max(curr,maxsum);
        }

        return maxsum;
    }
}
