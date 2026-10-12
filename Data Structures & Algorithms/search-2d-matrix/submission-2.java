class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int columns=matrix[0].length-1;
        for(int i=0;i<matrix.length;i++){
            int row=i;
            if(target>=matrix[row][0] && target<=matrix[row][columns]){
            int low=0;
            int high=columns;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(matrix[row][mid]==target) return true;
                    else if(target> matrix[row][mid]) low=mid+1;
                    else high=mid-1;
                }
            }
            if(target<matrix[row][0]) break;
        }
        return false;
    }
}