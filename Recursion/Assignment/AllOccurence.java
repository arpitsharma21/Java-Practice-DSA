package Recursion.Assignment;

/* For a given integer array of size N. You have to find all the occurrences (indices) of a given element (Key) and
    print them. Use a recursive function to solve this problem.
    Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
    Sample Output : 1 5 7 8
*/

public class AllOccurence {
    public static void printAllOccurence(int arr[],int key,int i){
                            //Brute Approach
//        for(int i =0;i< arr.length;i++){
//            if(arr[i] == key){
//                System.out.println(i);
//            }
//        }

                            //Recursive approach
        //base case
        if(i == arr.length){
            return;
        }

        if(arr[i] == key){
            System.out.print(i+" ");
        }
        printAllOccurence(arr,key,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        printAllOccurence(arr,key,0);
    }
}
