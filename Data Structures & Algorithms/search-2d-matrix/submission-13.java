class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] arr = helper(matrix, 0, matrix.length -1, target);

        if(arr.length == 0) return false;

        return helper2(arr, 0, arr.length -1, target);
        
    }
    
    public int[] helper(int[][] matrix, int left, int right, int target){

        int mid = (left + right)/2;
        if(left > right) return new int[0];
        if(matrix[mid][0] <= target && target <= matrix[mid][matrix[mid].length - 1]){
            return matrix[mid];
        }
        else if (target < matrix[mid][0]) return helper(matrix, left, mid -1, target);
        else return helper(matrix, mid + 1, right, target);
    }
    public boolean helper2(int[] arr, int left, int right, int target){

        int mid = (left + right)/2;
        if(left > right) return false;

        if(arr[mid] == target) return true;
        else if(target < arr[mid]) return helper2(arr, left, mid - 1, target);
        else return helper2(arr, mid + 1, right, target);
    }
}
