class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       
        int ans=0;
        for(int i=1;i<=arr.length;i=i+2){
            for(int z=0;z<=arr.length-i;z++){
                for(int j=z;j<z+i;j++){
                    ans+=arr[j];
                }
            }
           
        }
        return ans;
    }
}
