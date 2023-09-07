package Recursion;

public class LastOccurence {
    public static int lastOccurence(int arr[],int key,int i){
        //base case
        if(i == 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurence(arr,key,i-1);
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,20,3,5,5};
        int key = 5;
        System.out.println("Index of last key is: "+lastOccurence(arr,key, arr.length-1) );
    }
}
