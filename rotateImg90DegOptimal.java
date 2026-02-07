package Array_Medium;

public class rotateImg90DegOptimal {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                {4,5,6},
                {7,8,9}};
         rotate(matrix); // no return value

        // Print the rotated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        //convert row to col
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                //swap(i,j) with (j,i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse each row;
        for(int i = 0; i<n;i++){
            int left = 0;
            int right = n-1;

            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

    }
}
