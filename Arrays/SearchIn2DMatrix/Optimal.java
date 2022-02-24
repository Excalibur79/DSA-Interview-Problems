package Arrays.SearchIn2DMatrix;

public class Optimal {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n = matrix[0].length;
        int l=0;
        int h = (m*n)-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(matrix[mid/n][mid%n]==target)
                return true;
            else if(matrix[mid/n][mid%n]<target)
                l=mid+1;
            else
                h=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,13));
    }
}
