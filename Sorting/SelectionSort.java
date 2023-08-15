package Sorting;

public class SelectionSort {
    public static void sortSelect(int arr[]){
        int n = arr.length;
        //outer loop
        for(int i=0;i<n-1;i++){
            //taking the first element as minimum
            int minPos = i;
            //Then calculate the min element by iterating
            for(int j=i+1;j<n;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap minimum elem to current position
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        //to print array
        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,8,3,2,6,2};
        sortSelect(arr);
    }
}
