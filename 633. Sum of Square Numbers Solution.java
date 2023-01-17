class Solution {
    public boolean judgeSquareSum(int c) {
        long start=0;
        long end=(long)Math.sqrt(c);
        while(start<=end)
        {
            long curr=start*start+end*end;
            if(curr==c)
            {
                return true;
            }
            else if(curr<c)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return false;
    }
}
