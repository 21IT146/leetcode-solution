class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int f=0,s=1;
        for(int i=0;i<nums.length/2;i++)
        { 
           ans[f]=nums[i];
           f+=2;
           ans[s]=nums[i+n];
           s+=2;
          // n++;
        }
        return ans;
    }
}
