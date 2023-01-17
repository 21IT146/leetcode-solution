class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int elesum=0;
        int digitsum=0;
        for(int i=0;i<n;i++)
        {
           elesum+=nums[i];
           
           
           while(nums[i]!=0)
           {
               digitsum+=nums[i]%10;
               nums[i]/=10;
               
           }
        }
        return Math.abs(elesum-digitsum);
    }
}
