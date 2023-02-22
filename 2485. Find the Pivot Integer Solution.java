class Solution {
    public int pivotInteger(int n) {
        int sum=(1+n)*n/2;
        int pivot=(int)Math.sqrt(sum);
        if(sum==pivot*pivot){
            return pivot;
        }
        return -1;
    }
}
