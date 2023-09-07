package Recursion;

public class SortedOrNot {
    public static boolean isSorted(int arr[],int i){
        //base case
        if(arr[i] == arr.length -1){
            return true;
        }

        //if first value is greater than second than it will return false
        if(arr[i] > arr[i+1]){
                return false;
        }

        //if above is not then it will check other numbers by recursion
        return isSorted(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,13,4,5};
        System.out.println(isSorted(arr,0));
    }
}
