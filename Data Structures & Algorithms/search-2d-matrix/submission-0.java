class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++)
        {
            int left = 0;
            int right = matrix[i].length - 1;

            while(left <= right)
            {
                int center = left + (right - left)/2;
                int value = matrix[i][center];
                if(value == target) return true;
                else if(value > target) right = center-1;
                else left = center+1;
            }
        }

        return false;
    }
}
