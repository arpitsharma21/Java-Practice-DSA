package Dimension_2_Array;

public class SpiralBind {

    public static void spiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length -1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            //In this case row will be constant and col will be variable
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            //In this case col will be constant and row will be variable
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            //In this case row will be constant and col will be variable
            for(int j=endCol-1;j>=startCol;j--){
                //for the last elem to print and avoid duplicacy we use this
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            //In this case col will be constant and row will be variable
            for(int i=endRow-1;i>=startRow+1;i--){
                if(endCol == startCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow --;
            endCol--;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int matrix[][] = {  {1,2,3},
                            {4,5,6},
                            {7,8,9},
                            {10,11,12}
        };
        spiral(matrix);
    }
}
