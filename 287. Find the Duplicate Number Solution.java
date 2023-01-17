class Solution {
    public int findDuplicate(int[] nums) {
        int start=0,end=nums.length-1;
        Arrays.sort(nums);
        while(start<=end)
        {   int mid=(start+end)/2;
            if(nums[mid]>=mid+1)
             start=mid+1;
            else
            end=mid-1;
        }
        return nums[start];
    }
}
