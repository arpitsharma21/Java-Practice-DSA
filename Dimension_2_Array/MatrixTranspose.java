package Dimension_2_Array;

public class MatrixTranspose {
    public static void transpose(int matrix[][],int row,int col){
        int arr[][] = new int[col][row];
        for(int i=0;i< row;i++){
            for(int j=0;j<col;j++){
                arr[j][i] = matrix[i][j];
            }
        }
        for(int i=0;i< col;i++){
            for(int j=0;j<row;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3},
                {4,5,6}
        };
        int row = 2, column = 3;
        transpose(matrix,row,column);
    }
}
