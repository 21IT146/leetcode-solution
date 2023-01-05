public class Solution
{
     public int[] searchRange(int[] A, int target) 
        {
            int index = binarySearch(A, 0, A.length-1, target);
            int[] result = {-1, -1};
            if (index != -1) 
            {
               int left = index;
               int right = index;
               while (left != -1)
               {
                  result[0] = left;
                  left = binarySearch(A, 0, left-1, target);
               }
               while (right != -1)
               {
               result[1] = right;
               right = binarySearch(A, right+1, A.length-1, target);
               }
            
            }
            return result;
        }
     
    public int binarySearch(int[] A, int lo, int hi, int target) 
    {
         while (lo <= hi) 
         {
            int mid = lo + (hi - lo) / 2;
            if (A[mid] < target) lo = mid + 1;
            else if (A[mid] > target) hi = mid - 1;
            else return mid;
         }
         return -1;
    }
}
