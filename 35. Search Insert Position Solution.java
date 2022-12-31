class Solution {
    public int searchInsert(int[] number, int key) {
        int end=number.length-1;
        int start=0;
        
        //int mid=(start+end)/2;
        while(start<=end)
        {   
           int mid=(start+end)/2;
            if(number[mid]>key)
            {
                 end=mid-1;
            }
            else if(number[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return start;
    }
}
