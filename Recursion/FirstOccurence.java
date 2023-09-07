package Recursion;

public class FirstOccurence {
    public static int occurence(int arr[],int key,int i){
        //base case
        if(i == arr.length -1){
            return -1;
        }

        //checking if curr elem is equal to key
        if(arr[i] == key){
            return i;
        }
        return occurence(arr,key,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,15,20,3,5,3};
        int key = 5;
        System.out.println("Index of key is: "+occurence(arr,key,0));
    }
}
