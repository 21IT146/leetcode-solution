class Solution {
    public int minimumSum(int num) {
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=num%10;
            num/=10;
        }
        Arrays.sort(arr);
        int a = arr[0]*10+arr[2]+arr[1]*10+arr[3];
        return a;
    }
}
