class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int small[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int curr=nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++)
            {  
                if(curr>nums[j])
                {
                   count++;
                }  
            }
            small[i]=count;
        }
        return small;
    }
}
