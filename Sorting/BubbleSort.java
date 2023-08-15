package Sorting;

public class BubbleSort {
    public static void sortBubble(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,8,3,2,6,2};
        sortBubble(arr);
    }
}
