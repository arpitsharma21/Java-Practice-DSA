package Dimension_2_Array;

public class DiagonalSum {
    public static void printSum(int matrix[][]){
        int sum= 0;

                                    //brute force T= O(n^2)
//        for(int i=0;i< matrix.length;i++){
//            for(int j=0;j< matrix[0].length;j++){
//                //for primary diagonal we have
//                if(i==j){
//                    sum += matrix[i][j];
//                }
//                //for secondary diagonal
//                else if(i+j == matrix.length-1){
//                    sum+= matrix[i][j];
//                }
//            }
//        }

                                    //Optimized approach T= O(n)
        for(int i=0;i< matrix.length;i++){
            //for primary diagonal
            sum+= matrix[i][i];
            //for secondary diagonal. As i+j = n-1 then we can say j = n-1-i
            if(i!= matrix.length -1-i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        System.out.println("Sum is: "+sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {  {1,2,3},
                            {4,5,6},
                            {7,8,9}
        };
        printSum(matrix);
    }
}
