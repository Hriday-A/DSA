// time complexity - o(m+logn) --> not most optimal 

// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m = matrix.length;
//         int n =matrix[0].length;
//         int low=0;
//         int high=n-1;
//         for(int i=0;i<m;i++){
//             if(matrix[i][low]<=target && matrix[i][high]>=target){
//                 boolean flag=bs(matrix,low,high,i, target);
//                 return flag;
//             }
//         }
//         return false;
//     }
//     private boolean bs(int[][] matrix, int low, int high,int i, int t){
//         while(low<=high){
//             int mid= low+(high-low)/2;
//             if(matrix[i][mid]== t) return true;
//             else if(matrix[i][mid]< t){
//                 low=mid+1;
//             }else high= mid-1;
//         }
//         return false;
//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int low = 0, high = m * n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            int row = mid / n;
            int col = mid % n;
            
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) low = mid + 1;
            else high = mid - 1;
        }
        
        return false;
    }
}