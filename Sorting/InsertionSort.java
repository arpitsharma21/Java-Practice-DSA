package Sorting;

public class InsertionSort {
    public static void sortInsert(int arr[]){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;
            //finding correct position to insert
            //backtracking ji jaab tak hmara prev zero ni ho jata and previous elem curr elem se bada hai tak tak chale loop
            while(prev >= 0 && curr < arr[prev]){
                //piche ki traf push karna hai
                arr[prev + 1] = arr[prev];
                prev --;
            }
            //insertion
            arr[prev+1] = curr;
        }

        //to print array
        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,8,3,2,6,2};
        sortInsert(arr);
    }
}
