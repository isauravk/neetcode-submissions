class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length-1;
        int start=0;
        int end=matrix.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(target>=matrix[middle][0] && target<=matrix[middle][n]){
                int low=0;
                int high=n;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(matrix[middle][mid]==target) return true;
                    else if(target> matrix[middle][mid]) low=mid+1;
                    else high=mid-1;
                }
                return false;
            }
            else if(target>matrix[middle][0]) start=middle+1;
            else end=middle-1;
        }
        return false;
    }
}
