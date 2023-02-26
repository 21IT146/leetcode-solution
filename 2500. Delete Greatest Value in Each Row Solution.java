class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int res = 0;
        for (int[] i : grid){
            Arrays.sort(i);
        }

        for (int i = 0; i < grid[0].length; i++){
            int max = 0;
            for (int[] element : grid) {
                if (max <= element[i]) {
                    max = element[i];
                }
            }
            res = res + max;
        }
        return res;
    }
}
