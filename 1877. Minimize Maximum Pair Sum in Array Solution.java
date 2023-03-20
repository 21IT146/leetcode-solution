class Solution {
    public int minPairSum(int[] nums) {
        //the best way to find minimize pair sum is to add min no. with maximum number.
        int maxSum = 0, sum = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            sum = (nums[i] + nums[n - 1 - i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
