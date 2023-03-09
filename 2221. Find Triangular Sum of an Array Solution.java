class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
		
        if(n==1){
            return nums[0];
        }
		
        int[] arr=new int[n-1];
        int j=0;
        for(int i=0;i<n-1;i++){
            if((nums[i]+nums[i+1])>=10){
                arr[j]=(nums[i]+nums[i+1])%10;
            }
            else{
                arr[j]=nums[i]+nums[i+1];
            }
            j++;
        }
        return triangularSum(arr);
    }
}
