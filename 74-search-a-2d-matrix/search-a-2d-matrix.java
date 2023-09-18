class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nr = matrix.length, nc = matrix[0].length;
        int l = 0, r = (nr*nc)-1;
        int m = 0;

        while(l <= r){
            m = l + (r - l) / 2;
            if(target > matrix[m/nc][m%nc]){
                l = m + 1;
            }else if(target < matrix[m/nc][m%nc]){
                r = m - 1;
            }else{
                return true;
            }
        }
        return false;
    }
}