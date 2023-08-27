package Array.Practice;

/*Given an array arr[] of N positive integers. Push all the zeros of the given array to the right end of the array while
maintaining the order of non-zero elements.*/

public class AllZerosInEnd {
    public static void pushZerosToEnd(int arr[]){
        int n = arr.length;
        //for counting all non-zeroes number
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                //placing all non zeroes no. in front and incrementing count
                arr[count++] = arr[i];
            }
        }
        while(count < n){
            arr[count++] = 0;
        }


    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 0, 0, 4};
        pushZerosToEnd(arr);

    }
}
