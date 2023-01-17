class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length-1;
        return binarysearch(nums,n);
    }
    public static int binarysearch(int[] nums,int n)
    {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=(end+start)/2;
            if(mid==n)
            {
                if(nums[mid]>=nums[mid-1])
                {
                    return mid;
                }
            }
            else if(nums[mid]<nums[mid+1])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return start;
    }
}
