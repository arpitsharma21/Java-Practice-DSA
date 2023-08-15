package Dimension_2_Array;

public class SearchSortedArray {
    public static boolean search(int matrix[][],int key){

                            //taking right most top elem as first
//        //taking right most top element for this case
//        int row = 0;int col = matrix[0].length -1;
//        while (row < matrix.length && col >= 0){
//            //for base condition i.e element is present on the first element
//            if(matrix[row][col] == key){
//                System.out.print("Element found at index ("+row+","+col+")");
//                return true;
//            }
                //left ki taraf move karna hai
//            else if (key< matrix[row][col]) {
//                col--;
//            }
//            //if key is greater than matrix element we move downside
//            else{
//                row++;
//            }
//        }
//        System.out.print("Key not found");
//        return false;

                            //taking leftmost bottom elem as first
        int row = matrix.length - 1, col=0;
        while(row >=0 && col< matrix[0].length -1){
            //first elem as key
            if(matrix[row][col] == key){
                System.out.println("Elem found at "+row+" "+col);
                return true;
            }
            //key is bigger than elem
            else if (matrix[row][col] < key) {
                col++;
            }//key is smaller
            else{
                row--;
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {  {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9},
                            {10,11,12}
        };
        int key = 11;
        search(matrix,key);
    }
}
