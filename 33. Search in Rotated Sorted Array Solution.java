public class Solution {
public int search(int[] nums, int target) {
        int end = nums.length-1;
        int mid = end/2;
        for (int i = 0, a=mid, b=mid, v=end; i <= mid; i++, a--, b++, v--) {
            if (nums[i] == target) return i;
            if (nums[a] == target) return a;
            if (nums[b] == target) return b;
            if (nums[v] == target) return v;
        }
    return -1;
}
}
