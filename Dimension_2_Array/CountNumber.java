package Dimension_2_Array;

public class CountNumber {
    public static int search(int arr[][],int target){
        //Brute force - O(N^2)
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] [] = {
                {4,7,8,7},
                {8,8,7,8}
        };
        int target = 7;
        System.out.println(search(arr,target));
    }
}
