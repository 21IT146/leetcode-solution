class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i = 0; i < nums.length; i = i+2){
            len = len + nums[i];
        }
        int[] res = new int[len];
        int ind = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            for(int j = 0; j < nums[i]; j++){
                res[ind] = nums[i+1];
                ind++;
            }
        }
        return res;
    }
}
